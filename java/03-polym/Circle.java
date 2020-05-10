
public class Circle extends Object{
    protected double radius;
    protected String color;

    public Circle() {
        radius = 0;
        color = "blue";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;color="blue";
    }
    public Circle(double radius,String color){
        this.radius = radius;this.color = color;
    }

    void display(){
        System.out.format("Circle of radius %2.2f and color %s\n",this.radius,this.color);
    }
    double getArea(){
        return Math.PI*radius*radius;
    }

    public boolean equals(Circle c){
        return c.radius==radius && color.equalsIgnoreCase(c.color);
    }
    
}