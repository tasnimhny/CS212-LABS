import java.util.Objects;

public class Triangle extends Shape2D {
    private int width;  
    public Triangle (){ 
        super(Color.RED);  
        width = 1; 
    }

    public Triangle (int width){ 
        super(Color.RED); 
        if (width < 1){ 
            throw new IllegalArgumentException("Width cannot be less than 1"); 
        } 
        this.width = width; 
    }

    public int getWidth(){ 
        return width;
    }

    public Triangle setWidth(int width){
        if (width < 1){ 
            throw new IllegalArgumentException("Width cannot be less than 1"); 
        } 
        this.width = width;
        return this; 
    }

    public Triangle setColor(Color color){
        super.setColor(color);
        return this; 
}

    public double area (){ 
        double area = width * width;
        return area / 2.0; 
    }

    public double perimeter (){ 
        double hypo = Math.sqrt (Math.pow(width,2) + Math.pow(width,2));
        return hypo + width + width; 
    }

    @Override
    public String toString (){ 
        return super.toString() + 
        String.format (": {width %d}", width); 
    }

    @Override 
    public boolean equals (Object o){ 
        if (o == this ) return true;
        if (o == null || o.getClass() != getClass()) return false;

        Triangle t = (Triangle)o; 
        return width == t.width; 
    }

    @Override 
    public int hashCode() {
        return Objects.hash(width); 
    }

    public void draw(char ch){ 
        for (int r = 0; r < width; r++){ 
            for (int c = 0; c < width; c++){ 
                if (r >= c ){ 
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
    }

}