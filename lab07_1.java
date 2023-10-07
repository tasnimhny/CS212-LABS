
import java.util.Scanner;
public class lab07_1 {
    public static void main (String[] args ){ 
        Scanner num = new Scanner(System.in);
        int x; 
        System.out.println("Enter a postive Interger: ");
        x = num.nextInt(); 

        while (x < 0){
            System.out.println("Bad Input Try again:");
            x = num.nextInt();
         }
        while ( x > 0 ) {
                int temp = x % 10;
                if (temp == 5){
                    System.out.println("The number contains the digit 5 ");
                }
                x = x /10; 

            }
       

        
       

}
}

