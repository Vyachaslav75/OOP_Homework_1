public class Monk extends BaseHero{
    private int mana;
    private int manaMax;

    public Monk(int mana, int manaMax) {
        super(String.format("Hero_Monk #%d", ++Monk.number));
        this.mana = manaMax;
        this.manaMax = Monk.r.nextInt(100, 200);
    }
    public String getInfo(){
        return String.format("%s Mana: %d", super.getInfo(), this.mana);
    }
}
