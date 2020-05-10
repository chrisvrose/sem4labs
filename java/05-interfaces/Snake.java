
public class Snake implements TiredAnimal{
    String color;
    public Snake(){
        this.color = "green";
    }
    public Snake(String color){
        this.color = color;
    }
    public void eat(){
        System.out.println("The snake eats rats");
    }
    public void printColor(){
        System.out.println("Snake is "+ color +" color");
    }
    public void printTired() {
        System.out.println("The snake is "+(isTired()?"tired":"not tired"));
    }
    public void sound(){
        System.out.println("Hiss!");
    }
    public boolean isTired(){return tired;}

    @Override
    public String toString() {
        return "Snake";
    }
}