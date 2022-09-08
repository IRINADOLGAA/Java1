package Lesson2.Homework2;

public class HomeWorkApp2 {

    public static void main(String[] args) {
        System.out.println(checkSumOfNumber(0,5));
        System.out.println("**********");

        System.out.println(positiveOrNegativeNumber(-10));
        System.out.println("**********");

        System.out.println(printTrueOrFalse(-10));
        System.out.println("**********");

        printString("HELLO, WORLD!!!!", 2);
        System.out.println("**********");

        System.out.println(printLeapYear(500));


    }

    public static boolean checkSumOfNumber(int a, int b) {
        return (a + b >= 10) && (a + b <=20);
    }

    public static String positiveOrNegativeNumber(int a) {
        if (a >= 0) {
            return "Число положительное";
        } else {
            return "Число отрицательное";
        }
    }

    public static boolean printTrueOrFalse(int a) {
        return a <= 0;
    }

    public static void printString(String text, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(text);
        }
    }

    public static boolean printLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }


}
