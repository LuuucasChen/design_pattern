package main.lucas.decorator.sale;


public class CashRebate extends CashSuper {
    public double moneyRebate = 1;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double price, int num) {
        double result = price * num * this.moneyRebate;
        return super.acceptCash(result, 1);
    }
}
