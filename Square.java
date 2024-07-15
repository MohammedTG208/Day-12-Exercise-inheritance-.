public class Square extends Rectangle{

    public Square() {
    }

    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    @Override
    public double getAria() {
        return super.getWidth()*super.getWidth();
    }

    @Override
    public double getPerimeter() {
        return 4*super.getWidth();
    }

    @Override
    public String toString() {
        return "A Square with side="+super.getWidth()+"\nPerimeter of square: "+getPerimeter()+"\nAria of square "+getAria()+"\nwhich is\n" +
                "a subclass of Rectangle";
    }
}
