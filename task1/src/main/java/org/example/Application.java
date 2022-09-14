package org.example;

public class Application {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];


        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[0].length; ++j) {
                //псевдорандом числа в диапазоне от 0 до 10
                arr[i][j] = (int)((Math.random()*100+Math.random()*10+1)/10);
            }
        }

        int max = 0;
        int min = 10;
        double sum = 0; //не int тк далее деление sum на целочисленное должно давать double а деление целочисленного на целочисленное это int

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[0].length; ++j) {
                sum += arr[i][j];
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("Минимальное значение в массиве: "+min);
        System.out.println("Максимальное значение в массиве: "+max);
        System.out.println("Среднее значение в массиве: "+sum/(arr.length*arr[0].length));

        System.out.println("\nМассив:");
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[0].length; ++j) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

