package main.lucas.proxy;

public class Proxy implements IGiveGift {
    private Pursuit gg;

    public Proxy(SchoolGirl mm) {
        this.gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        this.gg.giveDolls();
    }

    @Override
    public void giveFollowers() {
        this.gg.giveFollowers();
    }
}
