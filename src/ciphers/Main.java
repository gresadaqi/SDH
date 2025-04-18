package ciphers;

public class Main {
    public static void main(String[] args) {
        //HOMOPHONIC CIPHER
        HomophonicCipher cipher = new HomophonicCipher();

        // Teksti origjinal për enkriptim
        String input = "HELLO WORLD";

        // Enkriptimi
        String encoded = cipher.encode(input);

        // Dekriptimi
        String decoded = cipher.decode(encoded);

        // Printimi i rezultateve
        System.out.println("Teksti origjinal  : " + input);
        System.out.println("Teksti i koduar   : " + encoded);
        System.out.println("Teksti i dekriptuar: " + decoded);



        //RAILFENCE CIPHER
        String message = "CYBERSECURITY";
        int numRails = 3;

        String encrypted = RailFenceCipher.encrypt(message.replaceAll(" ", ""), numRails);

        System.out.println("Mesazhi origjinal: " + message);
        System.out.println("Mesazhi i enkriptuar: " + encrypted);

        //MORSECODE CIPHER
    }
}
