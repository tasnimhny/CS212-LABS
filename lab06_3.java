import java.util.Scanner; 

public class lab06_3 {
    public static void main (String[] args){
        Scanner num = new Scanner(System.in); 
        int x; 

        System.out.print("Enter a postive integer: ");
        x = num.nextInt();
        while (x < 0){
                System.out.print("Invalid input! Try again: ");
                x = num.nextInt();
            }
                System.out.println("The factors for " + x + " are");
        for (int i = 1; i <= x; i++){
            if (x % i == 0) {
                System.out.print(i + " ");
            }
        }

        num.close();
    }

    
}
