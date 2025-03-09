package sjms.demo10;

import java.util.HashMap;

public class Order {

    private int id;
    private HashMap<String,Integer> fruitmap;
    public Order(){
        fruitmap = new HashMap<String,Integer>();
    }

    public String getID() {
        // TODO Auto-generated method stub
        return null;
    }

    public void setID(int id){
        this.id = id;
    }

    public HashMap<String,Integer> getfruitmap(){
        return fruitmap;
    }

    public void setFruitmap(String fruitkind,int quantity){
        this.fruitmap.put(fruitkind, quantity);
    }
}
