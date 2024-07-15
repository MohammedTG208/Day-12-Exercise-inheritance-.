public class Rectangle extends Shape{
    private double width;
    private double length;



    public Rectangle() {
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
//    Area of a Rectangle = (Length × Width)
    public double getAria(){
        if (this.length==0){
            length=1.0;
        }
        return this.length*this.width;
    }
    // P = (L + W) × 2
    public  double getPerimeter(){
        if (this.length==0){
            length=1.0;
        }
        return (this.length+this.width)*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width="+this.width+"and length="+this.length+"\n Perimeter of rectangle: "+getPerimeter()+"\nAria of rectangle :"+getAria()+"\nwhich is a subclass of Shape";
    }
}
