package ciphers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HomophonicCipher cipher = new HomophonicCipher();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Homophonic Cipher - Enkripto");
            System.out.println("2. Homophonic Cipher - Dekripto manualisht");
            System.out.println("3. Rail Fence Cipher");
            System.out.println("4. Morse Code Cipher");
            System.out.println("0. Dalje");
            System.out.print("Zgjedhja juaj: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Ju lutem shtypni një numër (0-4): ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // pas nextInt()

            switch (choice) {
                case 1 -> {
                    //  Enkriptim + Dekriptim Automatik (Normal)
                    // Përdoruesi jep tekstin, programi e kodon dhe pastaj e dekodon automatikisht
                    System.out.print("Shkruaj tekstin për enkriptim: ");
                    String input = scanner.nextLine();
                    String encoded = cipher.encode(input);
                    String decoded = cipher.decode(encoded);

                    System.out.println("\n--------------------------------------");
                    System.out.println("[Homophonic Substitution Cipher]");
                    System.out.println(String.format("%-25s: %s", "Teksti Origjinal", input));
                    System.out.println(String.format("%-25s: %s", "Teksti i Koduar", encoded));
                    System.out.println(String.format("%-25s: %s", "Teksti i Dekoduar", decoded));
                    System.out.println("--------------------------------------");
                }

                case 2 -> {
                   //Dekriptim Manual
                    // Përdoruesi jep vetë kodet (numra të ndarë me hapësira) që duhen dekriptuar
                    System.out.print("Shkruaj tekstin e koduar (numra të ndarë me hapësira): ");
                    String codedInput = scanner.nextLine();
                    String[] tokens = codedInput.trim().split(" ");
                    StringBuilder manualDecoded = new StringBuilder();

                    for (String token : tokens) {
                        String decodedChar = cipher.decode(token);
                        if (decodedChar.equals(token)) {
                            if (!cipherHasCode(cipher, token)) {
                                System.out.println("⚠️  Kodi '" + token + "' nuk ekziston në hartë.");
                            }
                        }
                        manualDecoded.append(decodedChar);
                    }

                    System.out.println("Teksti i dekriptuar: " + manualDecoded);
                }

                case 3 -> {
                    // RAILFENCE CIPHER – nuk ndryshohet logjika, vetëm vendoset në vendin e duhur
                    System.out.print("Shkruaj tekstin per enkriptim ose dekriptim: ");
                    String text = scanner.nextLine();

                    System.out.print("Shkruani numrin e binarëve: ");
                    int rails = scanner.nextInt();
                    scanner.nextLine(); // pas nextInt()

                    String encryptedText = RailFenceCipher.encrypt(text, rails);
                    System.out.println("Teksti i enkriptuar: " + encryptedText);

                    String decryptedText = RailFenceCipher.decrypt(text, rails);
                    System.out.println("Teksti i dekriptuar: " + decryptedText);
                }

                case 4 -> {
                    // MORSE CODE CIPHER – nuk ndryshohet logjika, vetëm vendoset në vendin e duhur
                    System.out.print("Shkruaj tekstin për enkriptim në Morse Code: ");
                    String tekstInput = scanner.nextLine();
                    String morse = MorseCode.enkriptimiNeMorse(tekstInput);
                    System.out.println("Teksti në Morse Code: " + morse);

                    System.out.print("Shkruaj kodin Morse për dekriptim: ");
                    String morseInput = scanner.nextLine();
                    String dekoduar = MorseCode.morseNeTekst(morseInput);
                    System.out.println("Teksti i dekriptuar: " + dekoduar);
                }

                case 0 -> System.out.println("Programi u mbyll.");

                default -> System.out.println("⚠️  Zgjedhje e pavlefshme. Provo përsëri.");
            }

        } while (choice != 0);

        scanner.close();
    }

    // Funksion ndihmës për kontrollim të kodit në Homophonic Cipher
    private static boolean cipherHasCode(HomophonicCipher cipher, String code) {
        String decoded = cipher.decode(code);
        return decoded.length() == 1 && Character.isLetter(decoded.charAt(0));
    }
}
