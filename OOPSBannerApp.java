/**
 * OOPS Banner Application
 * @author Kalainesan
 * @version 7.0
 */
public class OOPSBannerApp {

    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] characters = {
            new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
            }),
            new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
            }),
            new CharacterPatternMap('S', new String[]{
                " *** ",
                "*    ",
                "*    ",
                " **  ",
                "   * ",
                "   * ",
                " *** "
            })
        };

        String[] word = {"O", "O", "P", "S"};

        for (int line = 0; line < 7; line++) {
            StringBuilder sb = new StringBuilder();
            for (String letter : word) {
                for (CharacterPatternMap cp : characters) {
                    if (cp.getCharacter() == letter.charAt(0)) {
                        sb.append(cp.getPattern()[line]).append("  ");
                    }
                }
            }
            System.out.println(sb.toString());
        }
    }
}