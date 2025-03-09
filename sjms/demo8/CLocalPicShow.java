package sjms.demo8;

public class CLocalPicShow implements IShowPic, Runnable
{
    public void run(){
        pic.ShowPic(picname);
        System.out.println("图片调用完成");
    }   
    
    private IShowPic pic;
    private String picname;
    public void ShowPic(String picname){
        pic = new CRemoPic();
        this.picname = picname;
        System.out.println("准备载入图片");
        Thread th = new Thread(this);
        th.start();
    }
}
