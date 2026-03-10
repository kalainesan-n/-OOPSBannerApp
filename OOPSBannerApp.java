import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create Map to store character patterns
        Map<Character, String[]> patternMap = new HashMap<>();

        // Pattern for O
        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Pattern for P
        patternMap.put('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      ",
                "*      "
        });

        // Pattern for S
        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Word to print
        String word = "OOPS";

        // Banner height
        int height = 7;

        // Print banner
        for (int row = 0; row < height; row++) {

            for (char letter : word.toCharArray()) {

                String[] pattern = patternMap.get(letter);

                System.out.print(pattern[row] + "   ");
            }

            System.out.println();
        }
    }
}