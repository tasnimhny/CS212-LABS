import java.util.Scanner; 
public class lab08_1 {
    public static void main (String [] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number between 2 and 5: ");
        int x = num.nextInt(); 
        int result = 1;
        for (int i = 0; i < 10; i++){
            result *= x;
            System.out.print(" "+ result + " ");
            
        }


    }
    
}
