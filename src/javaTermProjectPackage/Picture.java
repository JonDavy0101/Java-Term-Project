package javaTermProjectPackage;

public class Picture {
    public static void pictureCreator() throws InterruptedException{
        System.out.println("\n\n");
        sailboatArray();
        System.out.println("\n\n\n\n");
        buildingArray();
        System.out.println("\n\n\n\n");
        pyramidArray();
    }

    private static void sailboatArray() throws InterruptedException {
        String[] newArray = new String[23];
        newArray[0] = "                      /-\\";
        newArray[1] = "                     /| |\\";
        newArray[2] = "                    / | | \\";
        newArray[3] = "                   /  | |  \\";
        newArray[4] = "                  /   | |   \\";
        newArray[5] = "                 /    | |    \\";
        newArray[6] = "                /     | |     \\";
        newArray[7] = "               /      | |      \\";
        newArray[8] = "              /       | |       \\";
        newArray[9] = "             /        | |        \\";
        newArray[10] = "            /         | |         \\";
        newArray[11] = "           /          | |          \\";
        newArray[12] = "          /           | |           \\";
        newArray[13] = "         /            | |            \\";
        newArray[14] = "        /             | |             \\";
        newArray[15] = "       /______________| |______________\\";
        newArray[16] = "    __________________|_|__________________";
        newArray[17] = "    \\ ____________________________________/";
        newArray[18] = "     \\                                   /";
        newArray[19] = "______\\_________________________________/______";
        newArray[20] = "      -            -    =          - =        -";
        newArray[21] = "           =    -            -             -";
        newArray[22] = " =     -               -           =           -";

        for (int x = 0; x < newArray.length; x++) {
            System.out.println(newArray[x]);
            Thread.sleep(500);
        }
    }

    private static void buildingArray() throws InterruptedException {
        String[] newArray = new String[37];
        newArray[0] = " ";
        newArray[1] = "             ~";
        newArray[2] = "           ~   ``~~";
        newArray[3] = "          (        )                                |";
        newArray[4] = "         (_         )                           \\   _   /";
        newArray[5] = "            ~~`~`~~             -_-               /   \\";
        newArray[6] = "                                               - (     ) -";
        newArray[7] = "              -_-                                 \\ _ /";
        newArray[8] = "                                        -_-     /       \\";
        newArray[9] = "                         -_-                        |";
        newArray[10] = "  -_-";
        newArray[11] = " ";
        newArray[12] = "                 _____________   _____________";
        newArray[13] = "                | _ _ _ _ _ _ | | _ _ _ _ _ _ |";
        newArray[14] = "                ||_|_|_|_|_|_|| ||_|_|_|_|_|_||";
        newArray[15] = "                | _ _ _ _ _ _ | | _ _ _ _ _ _ |";
        newArray[16] = "                ||_|_|_|_|_|_|| ||_|_|_|_|_|_||";
        newArray[17] = "                | _ _ _ _ _ _ | | _ _ _ _ _ _ |";
        newArray[18] = "                ||_|_|_|_|_|_|| ||_|_|_|_|_|_||";
        newArray[19] = "                | _ _ _ _ _ _ | | _ _ _ _ _ _ |";
        newArray[20] = "                ||_|_|_|_|_|_|| ||_|_|_|_|_|_||";
        newArray[21] = "                | _ _ _ _ _ _ | | _ _ _ _ _ _ |";
        newArray[22] = "                ||_|_|_|_|_|_|| ||_|_|_|_|_|_||";
        newArray[23] = "                | _ _ _ _ _ _ | | _ _ _ _ _ _ |";
        newArray[24] = "                ||_|_|_|_|_|_|| ||_|_|_|_|_|_||";
        newArray[25] = "                | _ _ _ _ _ _ | | _ _ _ _ _ _ |";
        newArray[26] = "                ||_|_|_|_|_|_|| ||_|_|_|_|_|_||";
        newArray[27] = "                | _ _ _ _ _ _ | | _ _ _ _ _ _ |";
        newArray[28] = "                ||_|_|_|_|_|_|| ||_|_|_|_|_|_||";
        newArray[29] = "                | _ _ _ _ _ _ | | _ _ _ _ _ _ |";
        newArray[30] = "                ||_|_|_|_|_|_|| ||_|_|_|_|_|_||";
        newArray[31] = "                | _ _ _ _ _ _ | | _ _ _ _ _ _ |";
        newArray[32] = "                ||_|_|_|_|_|_|| ||_|_|_|_|_|_||";
        newArray[33] = "                | _ _ _ _ _ _ | | _ _ _ _ _ _ |       O";
        newArray[34] = "                ||_|_|_|_|_|_|| ||_|_|_|_|_|_||      -|-";
        newArray[35] = "________________|_____________|_|_____________|______/_\\_______";
        newArray[36] = "_______________________________________________________________";

        for (int x = 0; x < newArray.length; x++) {
            System.out.println(newArray[x]);
            Thread.sleep(500);
        }
    }

    private static void pyramidArray() throws InterruptedException {
        String[] newArray = new String[17];
        newArray[0] = "                                  /\\";
        newArray[1] = "                                 /__\\";
        newArray[2] = "                                /___|\\";
        newArray[3] = "                               /_|____\\";
        newArray[4] = "                              /___|___|\\";
        newArray[5] = "                             /_|____|___\\";
        newArray[6] = "                            /____|____|__\\";
        newArray[7] = "                           /_|__|___|____|\\";
        newArray[8] = "                          /____|_____|_____\\";
        newArray[9] = "                         /_|____|_____|_____\\";
        newArray[10] = "                        /____|____|_______|__\\              -/=\\-";
        newArray[11] = "                       /_|_____|_____|_______|\\           -/-=|=-\\-";
        newArray[12] = "                      /_____|_______|_____|____\\             -=-";
        newArray[13] = "                     /|______|____|_____|_______\\             /";
        newArray[14] = "                    /____|______|_____|______|___\\            |";
        newArray[15] = "                   /___|___________|_______|______\\           \\";
        newArray[16] = "__________________/_________|________|__________|__\\__________|_______";

        for (int x = 0; x < newArray.length; x++) {
            System.out.println(newArray[x]);
            Thread.sleep(500);
        }
    }
}
