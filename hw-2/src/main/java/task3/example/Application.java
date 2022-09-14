package task3.example;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите подстроку: ");
        String key = scanner.nextLine();
        //через консоль null не ввести

        System.out.print("Введите строку, по которой идет поиск: ");
        String string = scanner.nextLine();;

        System.out.println(fuzzySearch(key, string));

    }

    public static boolean fuzzySearch(String key, String string) {

        String ans = "";
        for (int i = 0; i < string.length(); ++i) {
            if (key.indexOf(string.charAt(i)) != -1) {
                ans += string.charAt(i);
            }
        }

        if (key.equals(ans)) return true;
        return false;
    }


     /*
        Task3
            Реализовать функцию нечеткого поиска

                    fuzzySearch("car", "ca6$$#_rtwheel"); // true
                    fuzzySearch("cwhl", "cartwheel"); // true
                    fuzzySearch("cwhee", "cartwheel"); // true
                    fuzzySearch("cartwheel", "cartwheel"); // true
                    fuzzySearch("cwheeel", "cartwheel"); // false
                    fuzzySearch("lw", "cartwheel"); // false
         */
}
