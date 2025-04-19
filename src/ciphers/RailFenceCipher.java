package ciphers;

public class RailFenceCipher {

    public static String encrypt(String text, int rails) {
        if (rails <= 1) return text;


        StringBuilder[] rail = new StringBuilder[rails];
        for (int i = 0; i < rails; i++) {
            rail[i] = new StringBuilder();
        }

        int currentRail = 0;
        boolean goingDown = true;

        for (char c : text.toCharArray()) {
            rail[currentRail].append(c);


            if (currentRail == 0) {
                goingDown = true;
            } else if (currentRail == rails - 1) {
                goingDown = false;
            }


            currentRail += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : rail) {
            result.append(sb);
        }

        return result.toString();
    }

    public static String decrypt(String cipher, int rails) {
        if (rails <= 1) {
            return cipher;
        }

        boolean[][] railMatrix = new boolean[rails][cipher.length()];
        int currentRail = 0;
        boolean goingDown = true;


        for (int i = 0; i < cipher.length(); i++) {
            railMatrix[currentRail][i] = true;

            if (currentRail == 0) {
                goingDown = true;
            } else if (currentRail == rails - 1) {
                goingDown = false;
            }

            currentRail += goingDown ? 1 : -1;
        }


        char[][] resultMatrix = new char[rails][cipher.length()];
        int index = 0;
        for (int i = 0; i < rails; i++) {
            for (int j = 0; j < cipher.length(); j++) {
                if (railMatrix[i][j]) {
                    resultMatrix[i][j] = cipher.charAt(index++);
                }
            }
        }


        StringBuilder result = new StringBuilder();
        currentRail = 0;
        goingDown = true;
        for (int i = 0; i < cipher.length(); i++) {
            result.append(resultMatrix[currentRail][i]);

            if (currentRail == 0) {
                goingDown = true;
            } else if (currentRail == rails - 1) {
                goingDown = false;
            }

            currentRail += goingDown ? 1 : -1;
        }

        return result.toString();
    }

    }

            

