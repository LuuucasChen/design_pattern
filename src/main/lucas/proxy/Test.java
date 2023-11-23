package main.lucas.proxy;

public class Test {
    public static void main(String[] args) {
        SchoolGirl mm = new SchoolGirl();
        mm.setName("李四");

        Proxy proxy = new Proxy(mm);
        proxy.giveFollowers();
        proxy.giveDolls();
    }
}
