package ciphers;

import java.util.*;

public class HomophonicCipher {
    private final Map<Character, List<String>> substitutionMap;
    private final Map<String, Character> reverseMap;
    private final Random rand;

    public HomophonicCipher() {
        substitutionMap = new HashMap<>();
        reverseMap = new HashMap<>();
        rand = new Random();
        initializeDefaultMap();
        buildReverseMap();
    }

    /**
     * Initializes substitution map with multiple numeric codes for certain characters.
     * You can expand this map for more characters to make the cipher more robust.
     */
    private void initializeDefaultMap() {
        substitutionMap.put('A', Arrays.asList("12", "34"));
        substitutionMap.put('B', Arrays.asList("56", "78"));
        substitutionMap.put('C', Arrays.asList("90", "21"));
        substitutionMap.put('D', Arrays.asList("43", "65"));
        substitutionMap.put('E', Arrays.asList("87", "09"));
        substitutionMap.put('F', Arrays.asList("14", "24"));
        substitutionMap.put('G', Arrays.asList("33", "44"));
        substitutionMap.put('H', Arrays.asList("11", "13"));
        substitutionMap.put('I', Arrays.asList("19", "31"));
        substitutionMap.put('J', Arrays.asList("16", "36"));
        substitutionMap.put('K', Arrays.asList("17", "37"));
        substitutionMap.put('L', Arrays.asList("20", "22"));
        substitutionMap.put('M', Arrays.asList("25", "35"));
        substitutionMap.put('N', Arrays.asList("26", "46"));
        substitutionMap.put('O', Arrays.asList("30", "32"));
        substitutionMap.put('P', Arrays.asList("27", "47"));
        substitutionMap.put('Q', Arrays.asList("28", "48"));
        substitutionMap.put('R', Arrays.asList("29", "49"));
        substitutionMap.put('S', Arrays.asList("50", "60"));
        substitutionMap.put('T', Arrays.asList("51", "61"));
        substitutionMap.put('U', Arrays.asList("52", "62"));
        substitutionMap.put('V', Arrays.asList("53", "63"));
        substitutionMap.put('W', Arrays.asList("54", "64"));
        substitutionMap.put('X', Arrays.asList("55", "66"));
        substitutionMap.put('Y', Arrays.asList("57", "67"));
        substitutionMap.put('Z', Arrays.asList("59", "69"));
    }

    /**
     * Builds the reverse map used for decoding.
     */
    private void buildReverseMap() {
        for (Map.Entry<Character, List<String>> entry : substitutionMap.entrySet()) {
            for (String code : entry.getValue()) {
                reverseMap.put(code, entry.getKey());
            }
        }
    }

    /**
     * Encodes the input message using Homophonic Substitution.
     *
     * @param message the input text
     * @return encoded message as space-separated numeric codes
     */
    public String encode(String message) {
        if (message == null || message.isEmpty()) return "";

        StringBuilder encoded = new StringBuilder();

        for (char c : message.toUpperCase().toCharArray()) {
            if (Character.isLetter(c) && substitutionMap.containsKey(c)) {
                List<String> options = substitutionMap.get(c);
                encoded.append(options.get(rand.nextInt(options.size()))).append(" ");
            } else {
                // leave unsupported characters as is (e.g., spaces, punctuation)
                encoded.append(c).append(" ");
            }
        }

        return encoded.toString().trim();
    }

    /**
     * Decodes the encoded message back to plaintext.
     *
     * @param encodedMessage the encoded numeric message
     * @return decoded plain text
     */
    public String decode(String encodedMessage) {
        if (encodedMessage == null || encodedMessage.isEmpty()) return "";

        StringBuilder decoded = new StringBuilder();
        String[] tokens = encodedMessage.split(" ");

        for (String token : tokens) {
            if (reverseMap.containsKey(token)) {
                decoded.append(reverseMap.get(token));
            } else {
                decoded.append(token); // non-encoded characters (e.g., space, punctuation)
            }
        }

        return decoded.toString();
    }
}
