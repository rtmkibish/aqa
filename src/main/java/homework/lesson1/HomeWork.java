package homework.lesson1;

public class HomeWork {
    public void done() {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
        fifthTask();
        sixthTask();
        seventhTask();
        eighthTask();
    }

    public void firstTask() {
        System.out.println("TASK #1");
        String[] substringsToDisplay = {"", "\"To be ", "or not ", "to be...\"", "/ Shakespeare /"};
        String stringToDisplay = "";
        for (int i = 0; i < substringsToDisplay.length; i++) {
            String formating = "\t".repeat(i);
            stringToDisplay += formating + substringsToDisplay[i] + "\n";
        }
        System.out.print(stringToDisplay);
    }

    public void secondTask() {
        System.out.println("TASK #2");
        String pattern = "I love Java!";
        String stringToDisplay = "";
        short timesToDisplay = 5;
        byte indexCorrective = 1;
        for (int i = 0; i < timesToDisplay; i++) {
            stringToDisplay += pattern + "\n" + "\t".repeat(i + indexCorrective);
        }
        System.out.println(stringToDisplay.strip());
    }

    public void thirdTask() {
        System.out.println("TASK #3");
        System.out.println("\'\\t\', \'\\n\', \'\\\\\', \'\\\'\', \'\\\"\'.");
    }

    public void fourthTask() {
        System.out.println("TASK #4");
        System.out.println("package lesson1;\n\npublic class HomeWork {\npublic void done() {\n\t\tfirstTask();\n\t\tsecondTask();\n\t\tthirdTask();\n\t}\n\n\tpublic void firstTask() {\n\t\tString[] substringsToDisplay = {\"\", \"\\\"To be \", \"or not \", \"to be...\\\"\", \"/ Shakespeare /\"};\n\t\tString stringToDisplay = \"\";\n\t\tfor (int i = 0; i < substringsToDisplay.length; i++) {\n\t\t\tString formating = \"\\t\".repeat(i);\n\t\t\tstringToDisplay += formating + substringsToDisplay[i] + \"\\n\";\n\t\t}\n\t\tSystem.out.print(stringToDisplay);\n\t}\n\n\tpublic void secondTask() {\n\t\tString pattern = \"I love Java!\";\n\t\tString stringToDisplay = \"\";\n\t\tshort timesToDisplay = 5;\n\t\tbyte indexCorrective = 1;\n\t\tfor (int i = 0; i < timesToDisplay; i++) {\n\t\t\tstringToDisplay += pattern + \"\\n\" + \"\\t\".repeat(i + indexCorrective);\n\t\t}\n\t\tSystem.out.print(stringToDisplay);\n\t}\n\n\tpublic void thirdTask() {\n\t\tSystem.out.println(\"\\\'\\\\t\\\', \\\'\\\\n\\\', \\\'\\\\\\\\\\\', \\\'\\\\\\\'\\\', \\\'\\\\\\\"\\\'.\");\n\t}\n}");
    }

    public void fifthTask() {
        System.out.println("TASK #5");
        System.out.println("\tавгуст\nпн вт ср чт пт сб вс\n                   1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31");
    }

    public void sixthTask() {
        System.out.println("TASK #6");
        System.out.println("\t\t\t  *****\n\t\t      ****** *****     *****\n\t\t   *****\t ***** *   *\n\t       ******\t\t    *****  *\n\t    *****\t\t       ******\n\t******\t\t\t\t   *****\n     ******\t\t\t\t      *****\n ******************************************************\n***  *\t\t\t\t\t\t  *  ***\n     *\t\t\t\t\t\t  *\n     *         ***********         *********      *\n     *         *    *    *         *       *      *\n     *         ***********         *       *      *       **  **  **  **  **  **  **  **  **  **\n     *         *    *    *         *       *      *       **  **  **  **  **  **  **  **  **  **\n     *         ***********         *       *      *     ******************************************\n     *                             *       *      *       **  **  **  **  **  **  **  **  **  **\n     *                             *       *      *       **  **  **  **  **  **  **  **  **  **\n     *                             *       *      *     ******************************************\n     **********************************************       **  **  **  **  **  **  **  **  **  **");
    }

    public void seventhTask() {
        System.out.println("TASK #7");
        System.out.println("\t\t\tKibish Artem Oleksandrovich\n\t\t\t\t    *\n\t\t\t\t    *\n\t\t\t\t    *\n\t\t\t\t   * *\n\t\t\t\t  *   *\n\t    Galinko Tetyana Uriivna   Kibish Oleksandr Feodosiyovich\n\t\t    *\t\t\t\t*\n\t\t    *\t\t\t\t*\n\t\t    *\t\t\t\t*\n\t\t   * *\t\t\t       * *\n\t\t  *   *\t\t\t      *   *\n     Babushka Luda  Dedushka Yura  Dedushka Fedya  Babushka Marusya");
    }

    public void eighthTask() {
        System.out.println("TASK #8");
        System.out.println("              ****        *****      ***********     *******        ***        ***\n             ** **        **  ***        **          **            ** **      ** **\n            **  **        **   ***       **          *******      **   **    **   **\n           *******        **  ***        **          **          **     **  **     **\n          **    **        **             **          **         **       ****       **\n         **     **        **             **          *******   **         **         **");
    }
}
