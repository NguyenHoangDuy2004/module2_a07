package ss2.baitap;

public class PrintPrime {
    public static void main(String[] args) {
        for (int i = 2; 1 < 100; i++) {
            boolean check = true ;
            int count = 1;
            int j = 2 ;
            while ( j <= Math.sqrt(i)){
                if (i % j == 0) {
                    check = false ;
                    break;
                }
                j++;
            }
            count++ ;
            if (check && count <= 20){
                System.out.println(i);
            }
        }
    }
}
