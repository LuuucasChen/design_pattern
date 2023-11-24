package main.lucas.observer;

import java.util.Observable;
import java.util.Observer;

public class StockObserver implements Observer {
    protected String name;

    public StockObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Boss boss = (Boss) o;
        System.out.println(boss.name + ":" + boss.getAction() + "," + this.name + "请关闭股票");
    }
}
