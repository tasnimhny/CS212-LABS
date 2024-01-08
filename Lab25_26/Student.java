public class Student{
    private int id; 
    private String firstName; 
    private String lastName; 
    private double gpa;

    public Student(int id, String firstName, String lastName, double gpa){ 
        this.id = id; 
        this. firstName = firstName; 
        this.lastName = lastName; 
        this.gpa = gpa; 
    }

    public int getId(){ 
        return id;
    }

    public Student setId(int id){ 
        if (id < 1 || id >99){ 
            throw new IllegalArgumentException("not allowed");
        }
        this.id = id; 
        return this; 
    }

    public String getFirstName(){ 
        return firstName; 
    }

    public Student setFirstName(String firstName){
        if (firstName.length() < 2 || firstName == null){ 
            throw new IllegalArgumentException("bad name"); 
        }
        this.firstName = firstName; 
        return this; 
    }

       public String getLastName(){ 
        return lastName; 
    }

    public Student setLastName(String lastName){
        if (lastName.length() < 2 || lastName == null){ 
            throw new IllegalArgumentException("bad name"); 
        }
        this.lastName = lastName; 
        return this; 
    }

    public double getGpa(){ 
        return gpa; 
    }

    public Student setGpa(double gpa){ 
        if (gpa < 0 || gpa > 4.0){ 
            throw new IllegalArgumentException("bad gpa"); 
        }
        this.gpa = gpa; 
        return this; 
    }

    @Override 
    public String toString(){ 
        return String.format("%-10d | %-15s | %-20s | %5.2f\n", id, firstName, lastName, gpa);
    }
    
}
