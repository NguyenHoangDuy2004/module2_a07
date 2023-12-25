package ss3.baitap;

import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i =0; i < array.length;i++) {
            array[i] = scanner.nextInt();
        }
        int result = minVal(array);
        System.out.println("Min value in array is "+ result);
    }

    public static int minVal (int[] arr) {
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
