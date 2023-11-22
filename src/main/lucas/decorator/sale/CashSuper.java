package main.lucas.decorator.sale;

public class CashSuper implements ISale{
    protected ISale component;

    public void decorate(ISale component) {
        this.component = component;
    }
    public double acceptCash(double price, int num) {
        double result = 0;
        if (component != null) {
            result = this.component.acceptCash(price, num);
        }
        return result;
    }
}
