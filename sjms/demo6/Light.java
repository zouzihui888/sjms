package sjms.demo6;

public class Light {
    private String position;

    public Light(String position){
        this.position = position;
    }

    public void on(){
        System.out.println(this.position + "开灯");
    }

    public void off(){
        System.out.println(this.position + "关灯");
    }
}
