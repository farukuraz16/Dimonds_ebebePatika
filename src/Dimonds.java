import java.util.Scanner;

public class Dimonds {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in);
        System.out.println("Enter a number= ");
        int num=dat.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j =i ; j <num-1 ; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <(2*i+1); k++) {
                System.out.print("*");

            }System.out.println("");
        }

        for (int i = num; i >0 ; i--) {
            for (int j =i ; j <=num ; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <i*2-3; k++) {
                System.out.print("*");

            }System.out.println("");
        }
    }
}
