package main.lucas.observer;

import java.util.Observable;

public class Boss extends Observable {
    protected String name;
    private String action;

    public Boss(String name) {
        this.name = name;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
        super.setChanged();
        super.notifyObservers();
    }

}
