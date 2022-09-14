package org.example;

public class Application {
    public static void main(String[] args) {
        int[] arr = new int[] {5,6,3,2,5,1,4,9};

        for (int i = 0; i < arr.length-1; ++i) {
            for (int j = 0; j < arr.length-i-1; ++j) {
                if (arr[j] < arr[j+1]) {
                    int item = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = item;
                }
            }
        }

        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i]+" ");
        }

        //тест лежит в src/test/java/ApplicationTest
    }
}
