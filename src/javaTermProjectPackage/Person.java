package javaTermProjectPackage;

public class Person {
    public static void personCreator() throws InterruptedException {
        personCode();
    }

    private static void personCode() throws InterruptedException {
        System.out.println();

        // Arrays. Array structure is from Input class.
        String[] normalPerson = Input.arrayThreeInput(" O ", "-|-", "/ \\");
        String[] lazyPerson = Input.arrayThreeInput("ZZZ", "ZZZ", "ZZZ");
        String[] questionablePerson = Input.arrayThreeInput("???", "???", "???");
        String[] robot = Input.arrayThreeInput("010", "101", "010");

        int totalPersons = Input.integerInput("How many people are in your world: ");
        int totalNormalPerson = Input.integerInput("How many of these people are normal, hardworking people ("
                + totalPersons + " people to choose from): ");
        int totalLazyPerson = Input.integerInput("How many of these people are lazy (" + (totalPersons -
                totalNormalPerson) + " people to choose from): ");
        int totalQuestionablePerson = Input.integerInput("How many of these people are questionable (" +
                (totalPersons - totalNormalPerson - totalLazyPerson) + " people to choose from): ");
        int totalRobot = totalPersons - totalNormalPerson - totalLazyPerson - totalQuestionablePerson;

        System.out.println("\n\nTHERE ARE " + totalPersons + " PEOPLE IN YOUR WORLD.\n" +
                totalNormalPerson + " of these people are normal and hardworking.\n" +
                totalLazyPerson + " are just plain lazy.\n" +
                totalQuestionablePerson + " are sketchy and questionable.\n" +
                "And the remaining " + totalRobot + " \"people\" are robots.\n");

        // These are for keeping track of the individual people totals.
        int currentTotalNormalPerson = 0;
        int currentTotalLazyPerson = 0;
        int currentTotalQuestionablePerson = 0;
        int currentTotalRobot = 0;
        // These are for resetting the totals to the original values during the the three times the people loop.
        int resetTotalNormalPerson;
        int resetTotalLazyPerson;
        int resetTotalQuestionablePerson;
        int resetTotalRobot;
        // width represents how many people are in a row. depth represents the number of rows that are divisible
        // by width. extra represents the remainder of people that are not divisible by width.
        int width = 25;
        int depth = totalPersons / width;
        int extra = totalPersons % width;

        for (int x = 0; x < depth; x++) {
            // For every "Person" that is made, it has to iterate 3 times. This allows it to iterate.
            resetTotalNormalPerson = currentTotalNormalPerson;
            resetTotalLazyPerson = currentTotalLazyPerson;
            resetTotalQuestionablePerson = currentTotalQuestionablePerson;
            resetTotalRobot = currentTotalRobot;
            // First line. Creates top layer of people width.
            for (int z = 0; z < 25; z++) {
                if (currentTotalNormalPerson < totalNormalPerson) {
                    System.out.print(normalPerson[0] + " ");
                    currentTotalNormalPerson++;
                } else if (currentTotalLazyPerson < totalLazyPerson) {
                    System.out.print(lazyPerson[0] + " ");
                    currentTotalLazyPerson++;
                } else if (currentTotalQuestionablePerson < totalQuestionablePerson) {
                    System.out.print(questionablePerson[0] + " ");
                    currentTotalQuestionablePerson++;
                } else if (currentTotalRobot < totalRobot) {
                    System.out.print(robot[0] + " ");
                    currentTotalRobot++;
                }
            }
            // Create new line.
            System.out.println();
            // Places value to the reset value. This will keep the people aligned properly when printing.
            currentTotalNormalPerson = resetTotalNormalPerson;
            currentTotalLazyPerson = resetTotalLazyPerson;
            currentTotalQuestionablePerson = resetTotalQuestionablePerson;
            currentTotalRobot = resetTotalRobot;
            // Second line. Creates middle layer of people width.
            for (int z = 0; z < 25; z++) {
                if (currentTotalNormalPerson < totalNormalPerson) {
                    System.out.print(normalPerson[1] + " ");
                    currentTotalNormalPerson++;
                } else if (currentTotalLazyPerson < totalLazyPerson) {
                    System.out.print(lazyPerson[1] + " ");
                    currentTotalLazyPerson++;
                } else if (currentTotalQuestionablePerson < totalQuestionablePerson) {
                    System.out.print(questionablePerson[1] + " ");
                    currentTotalQuestionablePerson++;
                } else if (currentTotalRobot < totalRobot) {
                    System.out.print(robot[1] + " ");
                    currentTotalRobot++;
                }
            }
            // Create new line.
            System.out.println();
            // Places value to the reset value. This will keep the people aligned properly when printing.
            currentTotalNormalPerson = resetTotalNormalPerson;
            currentTotalLazyPerson = resetTotalLazyPerson;
            currentTotalQuestionablePerson = resetTotalQuestionablePerson;
            currentTotalRobot = resetTotalRobot;
            // Third line. Creates bottom layer of people width.
            for (int z = 0; z < 25; z++) {
                if (currentTotalNormalPerson < totalNormalPerson) {
                    System.out.print(normalPerson[2] + " ");
                    currentTotalNormalPerson++;
                } else if (currentTotalLazyPerson < totalLazyPerson) {
                    System.out.print(lazyPerson[2] + " ");
                    currentTotalLazyPerson++;
                } else if (currentTotalQuestionablePerson < totalQuestionablePerson) {
                    System.out.print(questionablePerson[2] + " ");
                    currentTotalQuestionablePerson++;
                } else if (currentTotalRobot < totalRobot) {
                    System.out.print(robot[2] + " ");
                    currentTotalRobot++;
                }
            }
            Thread.sleep(150);
            // Create 2 new lines.
            System.out.println();
            System.out.println();
        }

        // Like above, these reset the totals to what they were in the beginning of the for loop.
        resetTotalNormalPerson = currentTotalNormalPerson;
        resetTotalLazyPerson = currentTotalLazyPerson;
        resetTotalQuestionablePerson = currentTotalQuestionablePerson;
        resetTotalRobot = currentTotalRobot;
        for (int z = 0; z < extra; z++) {
            if (currentTotalNormalPerson < totalNormalPerson) {
                System.out.print(normalPerson[0] + " ");
                currentTotalNormalPerson++;
            } else if (currentTotalLazyPerson < totalLazyPerson) {
                System.out.print(lazyPerson[0] + " ");
                currentTotalLazyPerson++;
            } else if (currentTotalQuestionablePerson < totalQuestionablePerson) {
                System.out.print(questionablePerson[0] + " ");
                currentTotalQuestionablePerson++;
            } else if (currentTotalRobot < totalRobot) {
                System.out.print(robot[0] + " ");
                currentTotalRobot++;
            }
        }

        System.out.println();
        // Places value to the reset value. This will keep the people aligned properly when printing.
        currentTotalNormalPerson = resetTotalNormalPerson;
        currentTotalLazyPerson = resetTotalLazyPerson;
        currentTotalQuestionablePerson = resetTotalQuestionablePerson;
        currentTotalRobot = resetTotalRobot;
        for (int z = 0; z < extra; z++) {
            if (currentTotalNormalPerson < totalNormalPerson) {
                System.out.print(normalPerson[1] + " ");
                currentTotalNormalPerson++;
            } else if (currentTotalLazyPerson < totalLazyPerson) {
                System.out.print(lazyPerson[1] + " ");
                currentTotalLazyPerson++;
            } else if (currentTotalQuestionablePerson < totalQuestionablePerson) {
                System.out.print(questionablePerson[1] + " ");
                currentTotalQuestionablePerson++;
            } else if (currentTotalRobot < totalRobot) {
                System.out.print(robot[1] + " ");
                currentTotalRobot++;
            }
        }

        System.out.println();
        // Places value to the reset value. This will keep the people aligned properly when printing.
        currentTotalNormalPerson = resetTotalNormalPerson;
        currentTotalLazyPerson = resetTotalLazyPerson;
        currentTotalQuestionablePerson = resetTotalQuestionablePerson;
        currentTotalRobot = resetTotalRobot;
        for (int z = 0; z < extra; z++) {
            if (currentTotalNormalPerson < totalNormalPerson) {
                System.out.print(normalPerson[2] + " ");
                currentTotalNormalPerson++;
            } else if (currentTotalLazyPerson < totalLazyPerson) {
                System.out.print(lazyPerson[2] + " ");
                currentTotalLazyPerson++;
            } else if (currentTotalQuestionablePerson < totalQuestionablePerson) {
                System.out.print(questionablePerson[2] + " ");
                currentTotalQuestionablePerson++;
            } else if (currentTotalRobot < totalRobot) {
                System.out.print(robot[2] + " ");
                currentTotalRobot++;
            }
        }

        System.out.println();
    }
}
