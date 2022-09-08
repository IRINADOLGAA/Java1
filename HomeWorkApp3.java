package Lesson3.Homework3;


import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {
      //Задание 1
        int[] arr = {1, 0, 1, 1, 0, 0, 0, 1};
        printArray1("Before", arr);
        changeArray(arr);
        printArray1("After", arr);
        System.out.println("********************");

        //Задание 2
        int [] data = new int [100];
        fillArray(data);
        printArray1("Массив c значениями от 1 до 100", data);
        System.out.println("********************");

        //Задание 3
        int [] num = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArray1("Before", num);
        change(num);
        printArray1("After", num);
        System.out.println("********************");

        //Задание 4
        int [][] arr2 = new int[4][4];
        fillDiagonal(arr2);
        printArray2(arr2);
        System.out.println("********************");

        //Задание 5
        System.out.println(Arrays.toString(createArray(10, 5)));
        System.out.println("********************");

        //Задание 6
        int [] Arr = {1, 2, 3, 4};
        printArray1("Минимальное и максимальное значение соответственно", maxAndMin(Arr));
        System.out.println("********************");

        //Задание 7
        int [] sum = {1, 1, 1, 2, 5};
        System.out.println(equalsSumElements(sumAllElements(sum), sum));
        System.out.println("********************");

    }



    public static void changeArray(int [] Array) {
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == 1) {
                Array[i] = 0;
            } else {
                Array[i] = 1;
            }
        }
    }

    public static void fillArray (int [] Array) {
        int counter = 1;
        for (int i = 0; i < Array.length; i++) {
            Array[i] = counter;
            counter++;
        }
    }

    public static void change(int [] Array) {
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] < 6) {
                Array[i] *= 2;
            }
        }
    }

    public static void fillDiagonal(int [][] Array) {
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                if (i == j || (i + j) == 3) {
                    Array[i][j] = 1;
                }
            }
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] Arrive = new int[len];
        for (int i = 0; i < Arrive.length; i++) {
            Arrive[i] = initialValue;
        }
        return Arrive;
    }

    public static int[] maxAndMin(int [] Arr) {
        int max = 2;
        int min = 1;
        for (int j : Arr) {
            if (j >= max) {
                max = j;
            }
            if (j <= min) {
                min = j;
            }
        }
        return new int[] {min, max};
    }

    //сумма всех элементов
    public static int sumAllElements(int[]arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
    // сравнение суммы элементов левой и правой части после каждой итерации
    public static boolean equalsSumElements(int sum, int [] arr) {
        int sum1 = 0;
        for (int j : arr) {
            sum1 += j;
            sum -= j;
            if (sum == sum1)
                break;
        }
        return sum == sum1;
    }


    //Вспомогательный метод распечатки одномерного массива:
    public static void printArray1(String msg, int [] Array) {
        System.out.println(msg + ": ");
        for (int j : Array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }


    //Вспомогательный метод распечатки двумерного массива:
    public static void printArray2(int [][] Array) {
        for (int[] ints : Array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }



}








