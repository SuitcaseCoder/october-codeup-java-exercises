package shapes;

public class Square extends Quadrilateral {

//         -------- Inheritance & Polymorphism Exercises-------

//    private int side;
//
//    // constructor that accepts one argument
//    public Square(int side){
//        this.Rectangle(side, side);
//        this.side = side;
//
//    }
//
//    public int getArea(){
//        int area = this.side ^ 2;
//        return area;
//    }
//
//    public int getPerimeter(){
//        int perimeter = 4 * this.side;
//        return perimeter;
//    }
    
    //    // -------- Interfaces and Abstract Classes Exercises-------
    
    
    public void setLength(int side){
        this.length = side;
    }
    
    public void setWidth(int side){
        this.width = side;
    }
    

}
