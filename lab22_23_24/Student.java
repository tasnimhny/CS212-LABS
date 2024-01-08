
import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;
    private String name; 
    private Department department; 

    public Student (int id, String name, Department department){ 
        this.id = id; 
        this.name = name;
        this.department = department; 
    }

    String getName() {return name;}
    
    public int getId(){ return id;}


    Department getDepartment() {
        return department;
    }


    public Student setId(int id){ 
        if (id <= 0){ 
            throw new IllegalArgumentException("Not Valid"); 
        }
        this.id = id;
        return this;
    }

    public Student setName(String name) {
        if (name == null || name.length() < 2) {
            throw new IllegalArgumentException("Not valid");
        }
        this.name = name;
        return this;
    }

    public Student setDepartment(Department dept) {
        this.department = dept;
        return this;
    }

    @Override
    public String toString() {
        return "Department: " + getDepartment() + "\n" + "Name: " + getName() + "\n" + "ID: " + getId(); 
    }

    @Override
    public boolean equals(Object o){
        if(o == this)
            return true;
        if(o == null  || o.getClass() != getClass()) 
            return false;

        Student o1 = (Student) o;
        return department.equals(o1.department) && name.equals(o1.name) && id == o1.id;
    }

    
    
    @Override
    public int hashCode() {
        return Objects.hash(id,name,department);
    }

    @Override 
    public int compareTo(Student s){ 
        if (s.getId() > this.getId()){ 
            return 1;
        }else if(s.getId() < this.getId()){ 
            return -1;
        }else{ 
            return 0; 
        }
    }

    
    
}
