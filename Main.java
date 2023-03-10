public class Main {
    public static void main(String[] args) {

        BaseHero peasant1 = new Peasant();
        BaseHero robber1 = new Robber();
        BaseHero sniper1 = new Sniper();
        BaseHero wizard1 = new Wizard(100, 100);
        BaseHero spearman1 = new Spearman();
        BaseHero crossbowman1 = new Crossbowman();
        BaseHero monk1 = new Monk(100, 100);

        System.out.println(peasant1.getInfo());
        System.out.println(robber1.getInfo());
        System.out.println(sniper1.getInfo());
        System.out.println(wizard1.getInfo());
        System.out.println(spearman1.getInfo());
        System.out.println(crossbowman1.getInfo());
        System.out.println(monk1.getInfo());

    }
}