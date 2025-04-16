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

                // Lëviz në rail-in tjetër
                currentRail += goingDown ? 1 : -1;
            }

            StringBuilder result = new StringBuilder();
            for (StringBuilder sb : rail) {
                result.append(sb);
            }

            return result.toString();
        }

    public static void main(String[] args) {
        String message = "HELLO WORLD";
        int numRails = 3;

        String encrypted = encrypt(message.replaceAll(" ", ""), numRails);
        System.out.println("Encrypted: " + encrypted); // Output: HORELLOWLD
    }
}
            

