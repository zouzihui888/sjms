package sjms.demo7;


public abstract class APieca {
    protected String inKind;
    public APieca(String inKind){
        this.inKind = inKind;
    }

    public abstract void Play(int x,int y);
}
