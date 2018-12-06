package javaTermProjectPackage;

public class Game {
    public static void playGame() throws InterruptedException {
        selectGame();
    }

    private static void gameMenu() {
        System.out.println();

        // Menu array.
        String[] menu = Input.arrayFourInput("1. FONT CREATOR", "2. HOUSE BUILDER", "3. PERSON CREATOR",
                "4. PICTURE CREATOR", "5. EXIT");

        // Print menu.
        for (int x = 0; x < 5; x++) {
            System.out.println(menu[x]);
        }
        System.out.println();
    }

    private static void selectGame() throws InterruptedException {
        while (true) {
            gameMenu();

            // Type a number to choose a program.
            int input = Input.integerInput("Choose a program (1-4) or type 5 to exit: ");

            if (input == 1) {
                Letters.fontCreator();
            } else if (input == 2) {
                House.buildHouse();
            } else if (input == 3) {
                Person.personCreator();
            } else if (input == 4) {
                Picture.pictureCreator();
            } else if (input == 5) {
                break;
            } else {
                System.out.println("Sorry, you must choose a number between 1-5.");
            }
        }
    }
}
