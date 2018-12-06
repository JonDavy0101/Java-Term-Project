package javaTermProjectPackage;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Letters {
    public static void fontCreator() {
        fontCode();
    }

    private static void fontCode() {
        // alphabet dictionary
        Map<String, String> alphabet = new HashMap<>();

        alphabet.put("A", "\n" +
                "\n" +
                "       -----\n" +
                "      |     |\n" +
                "     |       |\n" +
                "    |         |\n" +
                "    | ------- |\n" +
                "    |         |\n" +
                "    |         |");
        alphabet.put("B", "\n" +
                "\n" +
                "    ---------\n" +
                "    |         |\n" +
                "    |        |\n" +
                "    ---------\n" +
                "    |        |\n" +
                "    |         |\n" +
                "    ---------");
        alphabet.put("C", "\n" +
                "\n" +
                "     ---------\n" +
                "    |         -\n" +
                "    |\n" +
                "    |\n" +
                "    |\n" +
                "    |         -\n" +
                "     ---------");
        alphabet.put("D", "\n" +
                "\n" +
                "    ---------\n" +
                "    |        |\n" +
                "    |         |\n" +
                "    |         |\n" +
                "    |         |\n" +
                "    |        |\n" +
                "    ---------");
        alphabet.put("E", "\n" +
                "\n" +
                "    ----------\n" +
                "    |\n" +
                "    |\n" +
                "    | ------\n" +
                "    |\n" +
                "    |\n" +
                "    ----------");
        alphabet.put("F", "\n" +
                "\n" +
                "    ----------\n" +
                "    |\n" +
                "    |\n" +
                "    | ------\n" +
                "    |\n" +
                "    |\n" +
                "    |");
        alphabet.put("G", "\n" +
                "\n" +
                "      -------\n" +
                "     |\n" +
                "    |\n" +
                "    |        ---\n" +
                "    |         |\n" +
                "     |       |\n" +
                "      -------");
        alphabet.put("H", "\n" +
                "\n" +
                "    |         |\n" +
                "    |         |\n" +
                "    |         |\n" +
                "    | ------- |\n" +
                "    |         |\n" +
                "    |         |\n" +
                "    |         |");
        alphabet.put("I", "\n" +
                "\n" +
                "      -------\n" +
                "         |\n" +
                "         |\n" +
                "         |\n" +
                "         |\n" +
                "         |\n" +
                "      -------");
        alphabet.put("J", "\n" +
                "\n" +
                "      ---------\n" +
                "          |\n" +
                "          |\n" +
                "          |\n" +
                "          |\n" +
                "    -     |\n" +
                "     -----");
        alphabet.put("K", "\n" +
                "\n" +
                "    |         |\n" +
                "    |       |\n" +
                "    |     |\n" +
                "    | ---\n" +
                "    |     |\n" +
                "    |       |\n" +
                "    |         |");
        alphabet.put("L", "\n" +
                "\n" +
                "    |\n" +
                "    |\n" +
                "    |\n" +
                "    |\n" +
                "    |\n" +
                "    |\n" +
                "    -----------");
        alphabet.put("M", "\n" +
                "\n" +
                "     --     --\n" +
                "    |  |   |  |\n" +
                "    |  |   |  |\n" +
                "    |   | |   |\n" +
                "    |   | |   |\n" +
                "    |    |    |\n" +
                "    |         |");
        alphabet.put("N", "\n" +
                "\n" +
                "    |         |\n" +
                "    ||        |\n" +
                "    |  |      |\n" +
                "    |    |    |\n" +
                "    |      |  |\n" +
                "    |        ||   \n" +
                "    |         |");
        alphabet.put("O", "\n" +
                "\n" +
                "      -------\n" +
                "     |       |\n" +
                "    |         |\n" +
                "    |         |\n" +
                "    |         |\n" +
                "     |       |\n" +
                "      -------");
        alphabet.put("P", "\n" +
                "\n" +
                "    ---------\n" +
                "    |        |\n" +
                "    |        |\n" +
                "    | -------\n" +
                "    |\n" +
                "    |\n" +
                "    |");
        alphabet.put("Q", "\n" +
                "\n" +
                "      -------\n" +
                "     |       |\n" +
                "    |         |\n" +
                "    |         |\n" +
                "    |         |\n" +
                "     |     |  |\n" +
                "      ------ |");
        alphabet.put("R", "\n" +
                "\n" +
                "    ---------\n" +
                "    |        |\n" +
                "    |        |\n" +
                "    | -------\n" +
                "    |  |\n" +
                "    |     |\n" +
                "    |        |");
        alphabet.put("S", "\n" +
                "\n" +
                "     --------\n" +
                "    |        -\n" +
                "    |\n" +
                "     ---------\n" +
                "              |\n" +
                "     -        |\n" +
                "      --------");
        alphabet.put("T", "\n" +
                "\n" +
                "    -----------     \n" +
                "         |\n" +
                "         |\n" +
                "         |\n" +
                "         |\n" +
                "         |\n" +
                "         |");
        alphabet.put("U", "\n" +
                "\n" +
                "    |         |\n" +
                "    |         |\n" +
                "    |         |\n" +
                "    |         |\n" +
                "    |         |\n" +
                "     |       |\n" +
                "      -------");
        alphabet.put("V", "\n" +
                "\n" +
                "    |         |\n" +
                "    |         |\n" +
                "     |       |\n" +
                "      |     |\n" +
                "       |   |\n" +
                "        | |\n" +
                "         |");
        alphabet.put("W", "\n" +
                "\n" +
                "    |         |\n" +
                "    |    |    |\n" +
                "    |   | |   |\n" +
                "    |   | |   |\n" +
                "    |  |   |  |\n" +
                "    |  |   |  |\n" +
                "     --     --");
        alphabet.put("X", "\n" +
                "\n" +
                "    |         |\n" +
                "     |       |\n" +
                "       |   |\n" +
                "         |\n" +
                "       |   |\n" +
                "     |       |\n" +
                "    |         |");
        alphabet.put("Y", "\n" +
                "\n" +
                "    |         |\n" +
                "     |       |\n" +
                "       |   |\n" +
                "         |\n" +
                "         |\n" +
                "         |\n" +
                "         |");
        alphabet.put("Z", "\n" +
                "\n" +
                "     ---------\n" +
                "             |\n" +
                "           |\n" +
                "         |\n" +
                "       |\n" +
                "     |\n" +
                "     ---------");
        alphabet.put(" ", "\n\n\n\n\n\n\n\n");

        // Ask user for input and convert the input into bigger font characters
        Scanner input = new Scanner(System.in);
        System.out.print("\nType out a few words (letters and spaces only): ");
        String wordInput = input.nextLine();

        for (int i = 0; i < wordInput.length(); i++) {
            char charWordInput = wordInput.charAt(i);
            char upperWordInput = Character.toUpperCase(charWordInput);
            String getWordInput = String.valueOf(upperWordInput);
            System.out.println(alphabet.get(getWordInput));
        }

    }

}