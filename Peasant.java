public class Peasant extends BaseHero{
    public Peasant() {
        super(String.format("Hero_Peasant #%d", ++Peasant.number));
    }
    public String getInfo(){
        return String.format("%s ", super.getInfo());
    }
}
