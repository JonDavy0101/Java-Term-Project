package javaTermProjectPackage;
import java.util.ArrayList;
import java.util.Scanner;

public class House {
    public static void buildHouse() {
        Scanner floorInput = new Scanner(System.in);
        System.out.print("\nHow many floors do you want in your house: ");
        int floorCount = floorInput.nextInt();

        Scanner floorWidthInput = new Scanner(System.in);
        System.out.print("\nHow many rooms wide do you want your house to be: ");
        int floorWidthCount = floorWidthInput.nextInt();


        topFloor(floorWidthCount - 1);
        if (floorCount > 1) {
            floorStairsRight(floorWidthCount - 1);
            for (int i = 0; i < (floorCount - 2); i++) {
                floorStairsLeft(floorWidthCount - 1);
                i = i + 1;
                if (i < (floorCount - 2)) {
                    floorStairsRight(floorWidthCount - 1);
                }
            }
        }
    }
    private static void topFloor(int floorWidthCount) {
        ArrayList<String> topFloorPiece = new ArrayList<>();

        topFloorPiece.add("\n\n                                           _/\\_                   ");
        topFloorPiece.add("                                         _/    \\_                 ");
        topFloorPiece.add("                                       _/        \\_               ");
        topFloorPiece.add("                                     _/            \\_             ");
        topFloorPiece.add("                                   _/                \\_           ");
        topFloorPiece.add("                                 _/                    \\_         ");
        topFloorPiece.add("                               _/                        \\_       ");
        topFloorPiece.add("                             _/                            \\_     ");
        topFloorPiece.add("                           _/                                \\_   ");
        topFloorPiece.add("                         _/                                    \\_ ");
        topFloorPiece.add("                        /________________________________________\\");
        topFloorPiece.add("                        |                                        |");
        topFloorPiece.add("                        |                                        |");
        topFloorPiece.add("                        |                                        |");
        topFloorPiece.add("                        |                                        |");
        topFloorPiece.add("                        |                                        |");
        topFloorPiece.add("                        |                                        |");
        topFloorPiece.add("                        |                                        |");
        topFloorPiece.add("                        |________________________________________|");

        ArrayList<String> topFloorAddition = new ArrayList<>();

        topFloorAddition.add("                  _/\\_                   ");
        topFloorAddition.add("                _/    \\_                 ");
        topFloorAddition.add("              _/        \\_               ");
        topFloorAddition.add("            _/            \\_             ");
        topFloorAddition.add("          _/                \\_           ");
        topFloorAddition.add("        _/                    \\_         ");
        topFloorAddition.add("      _/                        \\_       ");
        topFloorAddition.add("    _/                            \\_     ");
        topFloorAddition.add("  _/                                \\_   ");
        topFloorAddition.add(" /                                    \\_ ");
        topFloorAddition.add("/_______________________________________\\");
        topFloorAddition.add("                                        |");
        topFloorAddition.add("                                        |");
        topFloorAddition.add("                                        |");
        topFloorAddition.add("                                        |");
        topFloorAddition.add("                                        |");
        topFloorAddition.add("                                        |");
        topFloorAddition.add("                                        |");
        topFloorAddition.add("________________________________________|");

        for (int i = 0; i < 19; i++) {
            System.out.print(topFloorPiece.get(i));
            for (int n = 0; n < floorWidthCount; n++) {
                System.out.print(topFloorAddition.get(i));
            }
            System.out.println();
        }
    }

    private static void floorStairsRight(int floorWidthCount) {
        ArrayList<String> floorStairsRightPiece = new ArrayList<>();

        floorStairsRightPiece.add("                        |                                     _| |");
        floorStairsRightPiece.add("                        |                                   _|   |");
        floorStairsRightPiece.add("                        |                                 _|     |");
        floorStairsRightPiece.add("                        |                               _|       |");
        floorStairsRightPiece.add("                        |                             _|         |");
        floorStairsRightPiece.add("                        |                           _|           |");
        floorStairsRightPiece.add("                        |                         _|             |");
        floorStairsRightPiece.add("                        |________________________|_______________|");

        ArrayList<String> floorStairsRightAddition = new ArrayList<>();

        floorStairsRightAddition.add("                                     _| |");
        floorStairsRightAddition.add("                                   _|   |");
        floorStairsRightAddition.add("                                 _|     |");
        floorStairsRightAddition.add("                               _|       |");
        floorStairsRightAddition.add("                             _|         |");
        floorStairsRightAddition.add("                           _|           |");
        floorStairsRightAddition.add("                         _|             |");
        floorStairsRightAddition.add("________________________|_______________|");

        for (int i = 0; i < 8; i++) {
            System.out.print(floorStairsRightPiece.get(i));
            for (int n = 0; n < floorWidthCount; n ++) {
                System.out.print(floorStairsRightAddition.get(i));
            }
            System.out.println();
        }
    }

    private static void floorStairsLeft(int floorWidthCount) {
        ArrayList<String> floorStairsLeftPiece = new ArrayList<>();

        floorStairsLeftPiece.add("                        | |_                                     |");
        floorStairsLeftPiece.add("                        |   |_                                   |");
        floorStairsLeftPiece.add("                        |     |_                                 |");
        floorStairsLeftPiece.add("                        |       |_                               |");
        floorStairsLeftPiece.add("                        |         |_                             |");
        floorStairsLeftPiece.add("                        |           |_                           |");
        floorStairsLeftPiece.add("                        |             |_                         |");
        floorStairsLeftPiece.add("                        |_______________|________________________|");

        ArrayList<String> floorStairsLeftAddition = new ArrayList<>();

        floorStairsLeftAddition.add(" |_                                     |");
        floorStairsLeftAddition.add("   |_                                   |");
        floorStairsLeftAddition.add("     |_                                 |");
        floorStairsLeftAddition.add("       |_                               |");
        floorStairsLeftAddition.add("         |_                             |");
        floorStairsLeftAddition.add("           |_                           |");
        floorStairsLeftAddition.add("             |_                         |");
        floorStairsLeftAddition.add("_______________|________________________|");

        for (int i = 0; i < 8; i++) {
            System.out.print(floorStairsLeftPiece.get(i));
            for (int n = 0; n < floorWidthCount; n ++) {
                System.out.print(floorStairsLeftAddition.get(i));
            }
            System.out.println();
        }
    }
}
