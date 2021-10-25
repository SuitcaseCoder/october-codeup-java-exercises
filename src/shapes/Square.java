package shapes;

public class Square extends Rectangle {
    private int side;
    
    // constructor that accepts one argument
    public Square(int side){
        this.Rectangle(side, side);
        this.side = side;
        
    }
    
    public int getArea(){
        int area = this.side ^ 2;
        return area;
    }
    
    public int getPerimeter(){
        int perimeter = 4 * this.side;
        return perimeter;
    }
}
