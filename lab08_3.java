import java.util.Scanner;
public class lab08_3 {
    public static void main (String[] args){
        Scanner num = new Scanner(System.in);
        int n; 
        int oddCounter = 0;
        int x;
        System.out.print("Enter a postive Interger: ");
        n = num.nextInt();
        while ( n < 0){
            System.out.print("Try again"); 
            System.out.print("Enter a postive Interger: ");
            n = num.nextInt();
        }
        System.out.print("Now Enter "+ n +" more intergers: ");
        for (int i = 0; i < n; i++){
            x = num.nextInt(); 
            if (x % 2 !=0 ){
              oddCounter++;   
            
        }

    }
    System.out.println(oddCounter + " were odd.");
    
}
}
