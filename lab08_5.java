import java.util.Scanner; 
public class lab08_5 {
    public static void main (String [] args){ 
        Scanner num = new Scanner (System.in); 
        int n;
        System.out.print("Enter a value for n: ");
        n = num.nextInt(); 
        for (int r = 0; r < n; r++){
            for (int c = 0; c < n; c++ ){ 
            if ( r == c ){ 
                System.out.print("X");
            } else if (r == 0 || r == n-1) { 
                System.out.print("O");
            }else{ 
                System.out.print(" ");
            }
        }
        System.out.println();
        }
        
    
}
}