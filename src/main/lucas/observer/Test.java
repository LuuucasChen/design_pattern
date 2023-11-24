package main.lucas.observer;

import java.util.Observer;

public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss("张三");
        Observer observer1 = new StockObserver("李四");
        Observer observer2 = new NBAObserver("王五");

        boss.addObserver(observer1);
        boss.addObserver(observer2);

        boss.setAction("我回来了");
    }
}
