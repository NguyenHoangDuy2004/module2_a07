package ss3.baitap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {10,9,6,3,12};
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int index = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if (value1 == arr[i]){
                index = i ;
                break;
            }
        }
        for (int i = index ; i < arr.length-1 ; i++) {
            arr[i] = arr[i+1];
            arr[i+1] = 0 ;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j] + "\t");
        }
    }
}
