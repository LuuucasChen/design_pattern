package main.lucas.proxy;

public class Pursuit implements IGiveGift {
    private SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(this.mm.getName() + ",送你娃娃");
    }

    @Override
    public void giveFollowers() {
        System.out.println(this.mm.getName() + ",送你花");
    }
}
