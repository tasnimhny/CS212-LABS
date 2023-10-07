import java.util.Scanner;
public class lab07_3 {
    public static void main (String[] args ){ 
        Scanner num = new Scanner(System.in);
        int x; 
        System.out.println("Enter a number greater than 100");
        x = num.nextInt(); 
       while ( x < 100 ){
                System.out.println("Invalid input try again: ");
                x = num.nextInt();
            }
        for (int i = 1; i * i < x; ++i ){
            System.out.println(i + "\t"+ i * i );
        }

    
}
}
