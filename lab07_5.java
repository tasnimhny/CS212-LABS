import java.util.Scanner; 
public class lab07_5 {
    public static void main (String[] args ){ 
        Scanner num = new Scanner(System.in);
        int x; 
        System.out.print("Enter a number between 10 and 20: ");
        x = num.nextInt(); 

        for (int i = 0; i < x; i++){
            if (i % 2 == 0){
                System.out.print("^");
            }else{ 
                System.out.print("*");
            }
        }

            
}
}
