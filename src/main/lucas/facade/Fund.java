package main.lucas.facade;

public class Fund {
    Stock stock;
    Debt debt;

    public Fund() {
        stock = new Stock();
        debt = new Debt();
    }

    public void fundBuy() {
        stock.bug();
        debt.buy();
    }

    public void fundSell() {
        stock.sell();
        debt.sell();
    }
}
