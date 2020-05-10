import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Circle 1");
        System.out.println("Radius:");
        double radius1 = in.nextDouble();
        System.out.println("Color:");
        String color1 = in.next();
        Circle c1 = new Circle(radius1, color1);
        System.out.format("Area: %2.2f\n",c1.getArea());

        System.out.println("Circle 2");
        System.out.println("Radius:");
        double radius2 = in.nextDouble();
        System.out.println("Color:");
        String color2 = in.next();
        Circle c2 = new Circle(radius2, color2);
        System.out.format("Area: %2.2f\n",c2.getArea());

        System.out.println("The circles are "+(c1.equals(c2)?"equal":"not equal"));

        System.out.println("Cylinder 1");
        System.out.println("Height:");
        double height3 = in.nextDouble();
        System.out.println("Radius:");
        double radius3 = in.nextDouble();
        System.out.println("Color:");
        String color3 = in.next();
        Cylinder c3 = new Cylinder(height3,radius3,color3);
        System.out.format("Area: %2.2f, Volume: %2.2f\n",c3.getArea(),c3.getVolume());

        System.out.println("Cylinder 2");
        System.out.println("Height:");
        double height4 = in.nextDouble();
        System.out.println("Radius:");
        double radius4 = in.nextDouble();
        System.out.println("Color:");
        String color4 = in.next();
        Cylinder c4 = new Cylinder(height4,radius4,color4);
        System.out.format("Area: %2.2f, Volume: %2.2f\n",c4.getArea(),c4.getVolume());

        System.out.println("The cylinders are "+(c3.equals(c4)?"equal":"not equal"));


        System.out.println();
        in.close();
    }
}