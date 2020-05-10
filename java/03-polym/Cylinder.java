public class Cylinder extends Circle {
    protected double height;

    Cylinder() {
        super();
        height = 0;
    }
    Cylinder(double height){
        super();
        this.height = height;
    }

    Cylinder(double height,double r){
        super(r);
        this.height = height;
    }
    
    Cylinder(double height,double r,String color){
        super(r,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea(){
        return 2*(super.getArea()+Math.PI*height*getRadius());
    }

    public double getVolume(){
        return super.getArea()*height;
    }
    
    @Override
    public void display(){
        System.out.format("Cylinder of radius %2.2f, height %2.2f and color %s\n",this.radius,this.height,this.color);
    }

    public boolean equals(Cylinder s){
        return this.getVolume()==s.getVolume() && this.getArea()==s.getArea() && this.color.equalsIgnoreCase(s.color);
        // return this.radius==s.radius && this.height==s.height && this.color.equalsIgnoreCase(s.color);
    }
}