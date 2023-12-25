package ss3.baitap;

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);
        String a = "duy ng";
        int count = 0;
        for (int i = 0; i<a.length();i++){
            if (input == a.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

}

