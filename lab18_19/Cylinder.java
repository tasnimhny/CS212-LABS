import java.util.Objects;

public class Cylinder extends Shape3D{
    private int radius; 
    private int height;
   
    
    public Cylinder () { 
        super(Color.RED);
        radius = 1; 
    }

    public Cylinder (int radius, int height){ 
        super(Color.RED);
        if (radius < 1 || height < 1){ 
            throw new IllegalArgumentException("Radius or Height can't be less than 1");
        }
        this.radius = radius;
        this.height = height; 
    }

    public int getRadius(){ 
        return radius; 
    }

    public int getHeight(){ 
        return height; 
    }

    public Cylinder setRadius(int radius){ 
        if (radius < 1){ 
            throw new IllegalArgumentException("Radius Cannot be Less Than 1");
        }
        this.radius = radius; 
        return this; 
    }

    public Cylinder setHeight(int height){ 
          if (height < 1){ 
            throw new IllegalArgumentException("Height Cannot be Less Than 1");
        }
        this.height = height; 
        return this;
    }

    public Cylinder setColor(Color color){ 
        super.setColor(color);
        return this;
    }

    public double area () { 
      return  2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * height; 
    }

    public double volume (){ 
        return Math.PI * Math.pow(radius, 2) * height;
    }
    
        @Override
    public String toString (){ 
        return super.toString() + 
        String.format (": {radius %d,height %d}", radius , height); 
    }

    @Override 
    public boolean equals (Object o){ 
        if (o == this ) return true;
        if (o == null || o.getClass() != getClass()) return false;

        Cylinder c = (Cylinder)o; 
        return radius == c.radius && height == c.height; 
    }

    @Override 
    public int hashCode() {
        return Objects.hash(radius , height); 
    }

    public void draw (char ch){ 

        for (int r = radius; r >= 0; r--) {
            for (int c = -radius; c <= radius; c++) {
                if (r * r + c * c <= radius * radius) {
                    System.out.print(ch);       //upper half
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    

        for (int i = 0 ; i < height; i++) {
            for (int j = -1; j < 2 * radius; j++) {
                System.out.print(ch);   //cyl
            }
            System.out.println();
        }
    

        for (int r = 0; r <= radius; r++) {
            for (int c = -radius; c <= radius; c++) {
                if (r * r + c * c <= radius * radius) {
                    System.out.print(ch);
                } else {            //bottom half 
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
