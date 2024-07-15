public class Circle extends Shape{
    private double radius;

    public Circle(){

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
   private double pi=3.141559;

    public double getAria(){
        if (radius==0){
            radius=1.0;
        }
        return pi*(radius*radius);
    }
    //2*TT*radius
    // tt=3.14159
    public  double getPerimeter(){
        if (radius==0){
            radius=1.0;
        }
        return 2 * pi * radius;
    }
    @Override
    public String toString(){
        return "A Circle with\n" +
                "radius="+this.radius+"\nPerimeter of circle: "+getPerimeter()+"\nAria of circle "+getAria()+"\nwhich is a subclass of Shape";
    }
}
