package main.lucas.decorator.sale;


public class CashNormal implements ISale {
    @Override
    public double acceptCash(double price, int num) {
        return price * num;
    }
}
