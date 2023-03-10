public class Spearman extends BaseHero{
    public Spearman() {
        super(String.format("Hero_Spearman #%d", ++Spearman.number));
    }
    public String getInfo(){
        return String.format("%s ", super.getInfo());
    }
}
