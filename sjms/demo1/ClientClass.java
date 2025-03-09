package sjms.demo1;

import sjms.demo3.Apple;
import sjms.demo3.Banana;
import sjms.demo3.MyFruit;
import sjms.demo8.CLocalPicShow;
import sjms.demo8.CRemoPic;
import sjms.demo8.IShowPic;

public class ClientClass {

    public static void main(String[] args) {
        //Factory factor = new AFactory();
        //Fruit fruit = factor.CreateFruit("A");
        //Factory factor = (Factory)XMLUtil.getBean();
        //Fruit fruit = factor.CreateFruit();
        //fruit.eat();
        // MyFruit fru1 = new Apple();
        // MyFruit fru2 = fru1;
        // fru1.Display();
        // fru2.Display();
        // System.out.println("fru1:"+fru1.hashCode());
        // System.out.println("fru2:"+fru2.hashCode());

        CLocalPicShow cls = new CLocalPicShow();
        cls.ShowPic("我的图片");
        // IShowPic ipic = new CRemoPic();
        // IShowPic proxy = (IShowPic) new CLocalPicShow();
        // proxy.ShowPic("AAA");


    }
    public String factory(String fruitname){
        if(fruitname.equals("Apple")){
            return "Apple";
        }
        if(fruitname.equals("Banana")){
            return "Banana";
        }
        return null;
    }
}
