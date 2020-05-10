
public class Lion implements TiredAnimal{
    String color;
    public Lion(){
        this.color = "golden";
    }
    public Lion(String color){
        this.color = color;
    }
    public void eat(){
        System.out.println("the lion eats deer");
    }
    public void printColor(){
        System.out.println("Lion is "+ color +" color");
    }
    public void printTired() {
        System.out.println("The lion is "+(isTired()?"tired":"not tired"));
    }
    public void sound(){
        System.out.println("Roar!");
    }
    public boolean isTired(){return tired;}

    @Override
    public String toString() {
        return "Lion";
    }
}