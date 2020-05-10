import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Color of Lion:");
        String cl = in.next();
        System.out.println("Color of Snake:");
        String cs = in.next();
        TiredAnimal[] animals = new TiredAnimal[]{new Lion(cl),new Snake(cs)};
        for(TiredAnimal animal : animals){
            animal.printColor();
            animal.eat();
            animal.sound();
            animal.printTired();
        }


        in.close();
    }
}