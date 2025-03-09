package sjms.demo3;

import java.util.Hashtable;

public class MyFruitStore {
   // private static Hashtable fruittable = new Hashtable<Integer,MyFruit>();
   private static Hashtable fruittable = null;
   private static MyFruitStore fruitStore = null;
    private MyFruitStore(){
        fruittable = new Hashtable<Integer,MyFruit>();
    }
    public static MyFruitStore Getfruitstore(){
        if(fruittable==null){
            fruitStore = new MyFruitStore();
        }
        return fruitStore;
    }
    public static void Add(Integer key,MyFruit fruit){
        fruittable.put(key, fruit);
    }
    public static MyFruit Get(Integer key){
        MyFruit fruit = (MyFruit)fruittable.get(key);
        return (MyFruit)fruit.clone();
    }
}
