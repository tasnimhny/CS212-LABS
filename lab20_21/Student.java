public class Student {
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
    public boolean equals(Object o) {
        if (o != null && getClass() == o.getClass()) {
            Student other = (Student) o;
            if ((this.department == other.department) && (this.name.equals(other.name)) && (this.id == other.id)) {
                return true;
            }
        }
        return false;
    }
    
    
    @Override
    public int hashCode() {
        int result = department.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + Integer.hashCode(id);
        return result;
    }

    
    
}
