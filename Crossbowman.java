public class Crossbowman extends BaseHero{
    public Crossbowman() {
        super(String.format("Hero_Crossbowman #%d", ++Crossbowman.number));
    }
    public String getInfo(){
        return String.format("%s ", super.getInfo());
    }
}
