package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected int length;
    protected int width;
    
    public Quadrilateral(){};
    
    public Quadrilateral(int l, int w){
        this.length = l;
        this.width = w;
    }
    
    public int getLength(){
       return length;
    }
    
    public int getWidth() {
        return width;
    }
    
    public abstract void setLength(int length);
    
    public abstract void setWidth(int width);
    
    @Override
    public double getArea() {
        return 2 * this.length + this.width;
    }
    
    @Override
    public double getPerimeter() {
        return this.length * this.width;
    }
}

