import java.util.Scanner;

public class lab06_2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in); 
        System.out.print("Enter a number ");
        int x = num.nextInt(); 
         while (x <= 0){
            System.out.print("Invalid input try again: ");
            x = num.nextInt();
         }
        while (x > 0){
            System.out.print(x%2); 
            x = x/2;
        }
    num.close();
    }
}