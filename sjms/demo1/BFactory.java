package sjms.demo1;

public class BFactory extends Factory{
    public Fruit CreateFruit(){
        return new Banana();
    }
}
