import java.util.Objects;

public class Sphere extends Shape3D{
    private int radius; 

    public Sphere (){ 
        super(Color.RED);
         if (radius < 1){ 
            throw new IllegalArgumentException("Radius Cannot be Less Than 1");
         }
        radius = 1;
    }

    public Sphere (int radius){ 
        super(Color.RED);
        if (radius < 1){ 
            throw new IllegalArgumentException("Radius Cannot be Less Than 1");
        }
        this.radius = radius; 
    }

    public int getRadius(){ 
        return radius; 
    }

    public Sphere setRadius(int radius){
          if (radius < 1){ 
            throw new IllegalArgumentException("Radius Cannot be Less Than 1");
        }
        this.radius = radius; 
        return this; 
    }

    public Sphere setColor (Color color){ 
        super.setColor(color); 
        return this; 
    }

    public double area(){
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double volume(){
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

     @Override
    public String toString (){ 
        return super.toString() + 
        String.format (": {radius %d}", radius); 
    }

    @Override 
    public boolean equals (Object o){ 
        if (o == this ) return true;
        if (o == null || o.getClass() != getClass()) return false;      
        Sphere c = (Sphere)o; 
        return radius == c.radius; 
    }

    @Override 
    public int hashCode() {
        return Objects.hash(radius); 
    }
    
    public void draw(char ch) {
    
        for (int r = radius; r >= -radius; r--) { 
            for (int c = -radius; c <= radius; c++){ 
                if (r*r+c*c<= radius *radius){ 
                        System.out.print(ch);
                    }else{ 
                        System.out.print(" ");
                    }
 
                }
        System.out.println();
            }      
    }

}
