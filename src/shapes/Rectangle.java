package shapes;

// 1. Rectangle class (inside Shapes)

public class Rectangle {
    
    // 1. should have protected properties for length and width
    protected int length;
    protected int width;
    
    // constructor that accepts two numbers
    public void Rectangle(int l, int w){
        System.out.println(length);
        this.length = l;
        System.out.println(length);
        this.width = w;
    }
    
    // create a getArea method
    public int getArea(){
        int area = this.length * this.width;
        return area;
    }
    
    // create a getPerimeter method
    public int getPerimeter(){
        int perimeter = 2 * this.length + 2 * this.width;
        return perimeter;
    }
    
}


