public class Sniper extends BaseHero{
    public Sniper() {
        super(String.format("Hero_Sniper #%d", ++Sniper.number));
    }
    public String getInfo(){
        return String.format("%s ", super.getInfo());
    }
}
