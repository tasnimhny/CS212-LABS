import java.io.FileInputStream;
import java.io.FileNotFoundException; 
import java.util.TreeMap;
import java.util.Scanner; 

  

public class TreeMapStudent{
    public static void main(String [] args)throws FileNotFoundException{
        TreeMap<Integer, Student> container = new TreeMap<>();
         FileInputStream stream = new FileInputStream("students.txt"); 
        Scanner scanner = new Scanner(stream); 

        while (true){ 
          int x; 
            try{ 
                System.out.println("Avaliable menu items: \n   1. Print all students \n   2. Add a new student \n   3. Delete an existing student\n   4. Find new student with id\n   5. Quit the App \n Your choice [1-5]?");
                Scanner first = new Scanner(System.in);
                x = first.nextInt();
                if ( x < 1 || x > 5){ 
                System.out.println("Illegal menu item selected!\n");
                continue; 
                }
                if (x == 5){ 
                  break;
                }
            }
            catch(Exception e){
              System.out.println("Illegal menu item selected!\n");
              continue;
            }
            
            while(scanner.hasNextLine()){ 
            String str = scanner.nextLine();
            String[] line = str.split(",");
            if (line.length < 4)
                break; 
            
            Student student = new Student(1,"def", "def", 1.0); 
            student.setId(Integer.parseInt(line[0]));  
            student.setFirstName(line[1]);
            student.setLastName(line[2]); 
            student.setGpa(Double.parseDouble(line[3])); 

            container.put(student.getId(),student); 
        }

      if (x == 1){
        System.out.println("We have " + container.size() +" students...");
        for (var d: container.values())
        System.out.print(d);
        System.out.println("-------------------------------------");  
        }
        
      if (x == 2){ 
          Scanner add = new Scanner(System.in);
          String str; 
      
          System.out.println("Enter a id name and gpa"); 
          str = add.nextLine(); 

          String[] line = str.split(",");
          Student student = new Student(1,"def", "def", 1.0); 
          student.setId(Integer.parseInt(line[0]));  
          student.setFirstName(line[1]);
          student.setLastName(line[2]); 
          student.setGpa(Double.parseDouble(line[3])); 
          container.put(student.getId(),student); 

          System.out.println("Student " + student.getId() + "added" );
          System.out.println("-------------------------------------");  
        }

      if (x == 3){
        int y;
        Scanner remove = new Scanner(System.in);
        System.out.println("Enter and id to remove");
        y = remove.nextInt(); 
        System.out.println("Removing......");
        System.out.println(container.get(y));

        if (container.containsKey(y)){ 
          container.remove(y);
        }else{ 
          System.out.println("That id does not exist.");
          continue;
        }
      }

      if (x == 4){ 
        int y;
        Scanner remove = new Scanner(System.in);
        System.out.println("Enter the id to find");
        y = remove.nextInt(); 

        if (container.containsKey(y)){ 
          System.out.println("Finding.....");
          System.out.println(container.get(y));
        }else{
          System.out.println("That id does not exist.");
          continue;
        }
      
        }
      }
      
  }

}

