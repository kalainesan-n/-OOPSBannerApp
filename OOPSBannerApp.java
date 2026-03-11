/**
 * OOPS Banner Application
 * @author Kalainesan
 * @version 4.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] banner = {
            " ***   ***  ***  ***",
            "*   * *   * *  * *  ",
            "*   * *   * ***  ** ",
            "*   * *   * *      *",
            "*   * *   * *      *",
            "*   * *   * *  * *  ",
            " ***   ***  *    ***"
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}