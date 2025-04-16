package ciphers;

public class RailFenceCipher {

        public static String encrypt(String text, int rails) {
            if (rails <= 1) return text;  // Nëse kemi vetëm një rail, kthe tekstin origjinal

            // Krijo një array ku çdo rail është një StringBuilder
            StringBuilder[] rail = new StringBuilder[rails];
            for (int i = 0; i < rails; i++) {
                rail[i] = new StringBuilder();
            }

            int currentRail = 0;
            boolean goingDown = true;  // Fillon duke shkuar poshtë

            for (char c : text.toCharArray()) {
                rail[currentRail].append(c);

                // Ndrysho drejtimin kur arrin skajin
                if (currentRail == 0) {
                    goingDown = true;
                } else if (currentRail == rails - 1) {
                    goingDown = false;
                }

                // Lëviz në rail-in tjetër
                currentRail += goingDown ? 1 : -1;
            }
            

