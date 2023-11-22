package main.lucas.strategy.realStrategy;


public class CashContext {
    private CashSuper cashSuper;

    public CashContext(int cashType) {
        switch (cashType) {
            case 1:
                this.cashSuper = new CashNormal();
                break;
            case 2:
                this.cashSuper = new CashRebate(0.8d);
                break;
            case 3:
                this.cashSuper = new CashReturn(300d, 100d);
                break;
        }
    }

    public double getResult(double price, int num) {
        //根据具体策略调用算法方法
        return this.cashSuper.acceptCash(price, num);
    }
}
