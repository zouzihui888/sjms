package sjms.demo10;

public class OrderCommand implements Command{

    private Operator receiver;
    private Order order;
    public OrderCommand(Operator receiver,Order order){
        this.receiver = receiver;
        this.order = order;
    }


    public void execute(){
        System.out.println(order.getID()+"号顾客的成品");
        receiver.MrakFruit(order);
    }
}
