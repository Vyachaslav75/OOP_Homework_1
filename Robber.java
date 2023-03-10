public class Robber extends BaseHero{
    public Robber() {
        super(String.format("Hero_Robber #%d", ++Robber.number));
    }
    public String getInfo(){
        return String.format("%s ", super.getInfo());
    }
}
