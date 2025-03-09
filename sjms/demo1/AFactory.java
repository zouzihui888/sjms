package sjms.demo1;

public class AFactory extends Factory{
    public Fruit CreateFruit(){
        return new Apple();
    }
}
