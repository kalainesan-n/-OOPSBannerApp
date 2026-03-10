public class OOPSBannerApp {

    // CharacterPattern class
    static class CharacterPattern {

        char letter;
        String[] pattern;

        // constructor
        CharacterPattern(char letter, String[] pattern) {
            this.letter = letter;
            this.pattern = pattern;
        }

        // getter method
        String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Pattern for letter O
        CharacterPattern O = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Pattern for letter P
        CharacterPattern P = new CharacterPattern('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      ",
                "*      "
        });

        // Pattern for letter S
        CharacterPattern S = new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Word OOPS
        CharacterPattern[] word = {O, O, P, S};

        // Print banner
        for (int row = 0; row < 7; row++) {

            for (CharacterPattern cp : word) {
                System.out.print(cp.getPattern()[row] + "   ");
            }

            System.out.println();
        }
    }
}