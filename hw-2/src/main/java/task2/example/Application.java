package task2.example;

import java.util.*;

public class Application {

    public static int[] array = new int[]{};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Задайте размер массива: ");
        int n = Integer.parseInt(scanner.next());

        input(scanner, n);

        System.out.print("Введите число: " );
        int m = scanner.nextInt();

        System.out.print(findPair(array, m));

        //в примитивах int не может быть nullом так как запоолняется нулями
    }

    private static void input(Scanner scanner, int n) {
        System.out.print("Введите массив: ");
        array = new int[n];
        for (int i = 0; i < array.length; ++i)
            array[i] = Integer.parseInt(scanner.next());
    }

    public static String findPair(int[] array, int number) {
        Set<Integer> values = new HashSet<Integer>();
        for (int arr : array) {
            if (values.contains(number-arr))
                return "["+(number-arr)+","+arr+"]";

            values.add(arr);
        }

        return "Такой пары не существует!";
    }


    /*
        Task2

            [3, 4, 2, 7], 10 -> [3, 7] - вывести пару именно в скобках, которые дают сумму - 10

            Задача №2 - на вход подается массив и число. Нужно вывести первую пару чисел, которые дают в сумме число.
         */
}
