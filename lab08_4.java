import java.util.Scanner;
public class lab08_4 {
    public static void main (String [] args){ 
        Scanner num = new Scanner (System.in); 
        int n; 
        int s; 
        System.out.println("Enter a large interger: ");
        n = num.nextInt(); 
        for (int i = 0; i < 4; i++){
            System.out.println("Enter a smaller interger: ");
            s = num.nextInt();
            
            if (s >= n){
                System.out.println("Goodbye.");
                break; 
            }
            n = s; 
        }
        }
    }

