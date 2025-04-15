package ciphers;

import java.util.*;

public class HomophonicCipher {
    private final Map<Character, List<String>> substitutionMap;

    public HomophonicCipher() {
        substitutionMap = new HashMap<>();
        substitutionMap.put('A', Arrays.asList("12", "34"));
        substitutionMap.put('B', Arrays.asList("56", "78"));
        substitutionMap.put('C', Arrays.asList("90", "21"));
        substitutionMap.put('D', Arrays.asList("43", "65"));
        substitutionMap.put('E', Arrays.asList("87", "09"));
        substitutionMap.put('H', Arrays.asList("11", "13"));
        substitutionMap.put('L', Arrays.asList("20", "22"));
        substitutionMap.put('O', Arrays.asList("30", "32"));
        // Shto më shumë sipas nevojës
    }

    public String encode(String message) {
        StringBuilder encoded = new StringBuilder();
        Random rand = new Random();

        for (char c : message.toUpperCase().toCharArray()) {
            if (substitutionMap.containsKey(c)) {
                List<String> options = substitutionMap.get(c);
                encoded.append(options.get(rand.nextInt(options.size()))).append(" ");
            } else {
                encoded.append(c).append(" ");
            }
        }
        return encoded.toString().trim();
    }
}
