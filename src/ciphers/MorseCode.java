package ciphers;
import java.util.HashMap;
import java.util.Map;

public class MorseCode {
    private static final Map<Character, String> morseCodeMap = new HashMap<>();

    static {
        morseCodeMap.put('A', ".-");
        morseCodeMap.put('B', "-...");
        morseCodeMap.put('C', "-.-.");
        morseCodeMap.put('D', "-..");
        morseCodeMap.put('E', ".");
        morseCodeMap.put('F', "..-.");
        morseCodeMap.put('G', "--.");
        morseCodeMap.put('H', "....");
        morseCodeMap.put('I', "..");
        morseCodeMap.put('J', ".---");
        morseCodeMap.put('K', "-.-");
        morseCodeMap.put('L', ".-..");
        morseCodeMap.put('M', "--");
        morseCodeMap.put('N', "-.");
        morseCodeMap.put('O', "---");
        morseCodeMap.put('P', ".--.");
        morseCodeMap.put('Q', "--.-");
        morseCodeMap.put('R', ".-.");
        morseCodeMap.put('S', "...");
        morseCodeMap.put('T', "-");
        morseCodeMap.put('U', "..-");
        morseCodeMap.put('V', "...-");
        morseCodeMap.put('W', ".--");
        morseCodeMap.put('X', "-..-");
        morseCodeMap.put('Y', "-.--");
        morseCodeMap.put('Z', "--..");

        morseCodeMap.put('0', "-----");
        morseCodeMap.put('1', ".----");
        morseCodeMap.put('2', "..---");
        morseCodeMap.put('3', "...--");
        morseCodeMap.put('4', "....-");
        morseCodeMap.put('5', ".....");
        morseCodeMap.put('6', "-....");
        morseCodeMap.put('7', "--...");
        morseCodeMap.put('8', "---..");
        morseCodeMap.put('9', "----.");

        morseCodeMap.put(' ', "/");
    }
    //Enkriptimi i morseCode-it

    public static String enkriptimiNeMorse(String input) {
        StringBuilder morseBuilder = new StringBuilder();
        input = input.toUpperCase();

        for (char c : input.toCharArray()) {
            if (morseCodeMap.containsKey(c)) {
                morseBuilder.append(morseCodeMap.get(c)).append(" ");
            } else {
                morseBuilder.append("? ");
            }
        }

        return morseBuilder.toString().trim();
    }
    // Dekriptimi i morseCode-it

    public static String morseNeTekst(String morseInput) {

        Map<String, Character> reverseMap = new HashMap<>();
        morseCodeMap.forEach((k, v) -> reverseMap.put(v, k));

        // Ndahet fjalia sipas hapësirave (karakteret) dhe '/' (fjalët)
        String[] kode = morseInput.trim().split(" ");
        StringBuilder rezultat = new StringBuilder();

        for (String kod : kode) {
            if (kod.equals("/")) {
                rezultat.append(" ");
            } else {
                rezultat.append(reverseMap.getOrDefault(kod, '?'));
            }
        }

        return rezultat.toString();
    }

}



