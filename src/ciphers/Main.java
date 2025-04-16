package ciphers;

public class Main {
    public static void main(String[] args) {
        HomophonicCipher cipher = new HomophonicCipher();

        String input = "HELLO";
        String encoded = cipher.encode(input);

        System.out.println("Teksti origjinal: " + input);
        System.out.println("Teksti i koduar (Homophonic): " + encoded);

        String message = "CYBERSECURITY";
        int numRails = 3;

        String encrypted = RailFenceCipher.encrypt(message.replaceAll(" ", ""), numRails);

        System.out.println("Mesazhi origjinal: " + message);
        System.out.println("Mesazhi i enkriptuar: " + encrypted);
    }
}
