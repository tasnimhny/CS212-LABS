import java.util.Scanner; 
public class lab07_4 {
    public static void main (String[] args ){ 
        Scanner num = new Scanner(System.in);
        int x; 
        int i = 0;
        double sum = 0;
        while (true) {
        System.out.print("Enter a numeric grade enter -1 if you wish to stop: ");
        x = num.nextInt(); 
       
        if ( x < 0){
            double avg = (double) sum/i; 
            System.out.println("The average is: "+ avg);
            break;
        }
        sum += x;
        ++i;

        }
    
}
}
