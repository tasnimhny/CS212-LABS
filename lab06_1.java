public class lab06_1 {
    public static void main(String[] args) {
    double salary = 0.01;
    int day = 1;
    System.out.println("Day\tSalary");
    while (salary <= 10000) {
        System.out.println(day+ "\t" + salary);
        salary *= 2; 
        day++;
    }
    
}
}
