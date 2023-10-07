import java.util.Scanner;
public class lab07_2 {
    public static void main (String[] args ){ 
        Scanner num = new Scanner(System.in);
        int x; 
        System.out.println("Enter a integer between 1 and 100: ");
        x = num.nextInt(); 
       while ( x < 0 || x > 100 ){
                System.out.println("Try again"); 
                System.out.println("Enter a integer between 1 and 100: ");
                x = num.nextInt();
            }
            System.out.print("The first 20 multiples of "+ x + " are: ");
            for (int i = 1; i <= 20; i++){
                int multiple = x * i;
                System.out.print( multiple + " ");
            }

        }
    }
    
    
    

