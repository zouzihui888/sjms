package sjms.demo10;

public class Operator {

    public void MrakFruit(Order order) {
        // TODO Auto-generated method stub
        String str = "";
        for(String key:order.getfruitmap().keySet()){
            str+=key+order.getfruitmap().get(key);
        }
        System.out.println("黑暗混合汁："+str);
    }

}
