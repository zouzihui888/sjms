package sjms.demo10;

import java.util.ArrayList;

public class Waitorlnvoker {
    private ArrayList<Command> commands = null;
    public Waitorlnvoker(){
        commands = new ArrayList<Command>();

    }
    public void SetCommand(Command cmd){
        commands.add(cmd);
    }
    public void OrderUp(){
        System.out.println("有订单");
        for(Command cmd:commands){
            if(cmd!= null){
                cmd.execute();
            }
        }
    }
}
