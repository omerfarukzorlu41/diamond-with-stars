import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Please enter a number: ");
        number = scanner.nextInt();
        for(int i = 1;i <= number;i++){
            for(int k = 1; k <= (number-i) ;k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i)-1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
          for(int m = 1; m < number ;m++){
              for(int a =1; a <= m ;a++){
                  System.out.print(" ");
              }
              for(int b =1; b <= (2*(number-m)) -1 ;b++){
                  System.out.print("*");
              }
              System.out.println();
          }
    }
}
