import java.util.Scanner; 

public class lab06_4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in); 
        int sum = 0;
        int x; 
       
        while (true){
        System.out.print("Enter the price of your item: ");
        x = num.nextInt();
        sum += x; 
        if (x == 0 ){
            System.out.print("Total cost is: " + sum );
            if (sum >= 100){
                System.out.print(" That's expensive!");
            }
            break;
        }
    
 }
 num.close();
}
}
