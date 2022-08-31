package Lesson1;

public class HomeWorkApp {

    public static void main (String[] args) {
        printThreeWords("Orange", "Banana", "Apple");

        System.out.println("***********");

        if (checkSumSign(-9, 6)) {
            System.out.println("Cумма положительная");
        } else {
            System.out.println("Cумма отрицательная");
        }

        System.out.println("**********");

        System.out.println(printColor(101));

        System.out.println("*********");

        System.out.println(compareNumber(5, 5));
    }

    public static void printThreeWords (String word1, String word2, String word3) {
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }

    public static boolean checkSumSign (int a, int b) {
        return a + b >= 0;
    }

    public static String printColor (int value) {
        if (value <= 0) {
            return "Красный";
        } else if (value >0 && value <= 100) {
            return "Желтый";
            } else {
            return "Зеленый";
        }
    }

    public static String compareNumber (int a, int b) {
        if (a >= b) {
            return "a >= b";
        } else {
            return "a < b";
        }
    }

}


