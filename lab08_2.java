import java.rmi.server.SocketSecurityException;
import java.util.Scanner; 
public class lab08_2 {
    public static void main (String[] args ){ 
        Scanner num = new Scanner(System.in);
        int x; 
        System.out.println("Enter a postive Interger: ");
        x = num.nextInt();
        while ( x < 0){
            System.out.println("Try again"); 
            System.out.println("Enter a postive Interger: ");
            x = num.nextInt();
        }
        for (int i = 1; i <= x; i++){
            if ( i % 2 == 0){
                System.out.print(" "+ i * -1+ " ");
            }else{ 
                System.out.print(i);
            }
        }
    
}
}