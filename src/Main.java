import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        task5(5,8);
        task6(-5);
        task7(9);
        task8("Строка", 3);
        System.out.println(task9(1988));
        task10();
        task11();
        task12();
        task13();
        task14(2,3);
    }
    //1.
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    //2.

    public static void checkSumSign() {
        int a = 5;
        int b = 3;
        int x = a + b;
        if (x >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
            }


    }
    //3.
    public static void printColor() {
        int value = 7;
        if (value <= 0) {
            System.out.println("Красный");
        } if (value > 0 && value <= 100) {
        System.out.println("Желтый");
        } if (value > 100) {
            System.out.println("Зеленый");
        }
    }
   //4.
   public static void compareNumbers() {
        int a = 23;
        int b = 12;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
   }
   //5.
   public static void task5(int a, int b) {
      int number1 = a;
      int number2 = b;
       int summa = number1 + number2;
       if (summa >= 10 && summa <= 20) {
           System.out.println(true);
       } else {
           System.out.println(false);
       }
   }
   //6.
   public static void task6 (int a) {
        int number = a;
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
   }
   //7.
    public static void task7 (int a) {
        int number = a;
        if (number < 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    //8.
    public static void task8 (String a, int b) {
        for (int i = 0; i < b ; i++) {
            System.out.println(a);
        }

    }
    //9.
    public static boolean task9 (int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
    //10.
    public static void task10 () {
        int [] arr = new int [] {1,1,0,0,1,0,1,1,0,0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }
            else arr[i] = 0;

        }
        System.out.println(Arrays.toString(arr));
    }
    //11.
    public static void task11 () {
        int [] arr = new int[100];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i+1;

        }
        System.out.println(Arrays.toString(arr));
    }
    //12.
    public static void task12 () {
        int [] arr = new int [] {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] *= 2;


        }
        System.out.println(Arrays.toString(arr));
    }

    //13.
    public static void task13 () {
        int[][] arr = new int[9][9];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || i + j == arr.length - 1) {
                    arr[i][j] = 1;

                }
                System.out.print (arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    //14.
    public static int[] task14 (int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    return arr;
    }







}

