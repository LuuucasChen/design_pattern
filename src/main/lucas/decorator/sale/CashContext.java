package main.lucas.decorator.sale;


public class CashContext {
    private ISale component;

    public CashContext(int cashType) {
        switch (cashType) {
            case 1:
                this.component = new CashNormal();
                break;
            case 2:
                this.component = new CashRebate(0.8d);
                break;
            case 3:
                this.component = new CashReturn(300d, 100d);
                break;
            case 4:
                //先打8折，再满300-100
                CashNormal cashNormal = new CashNormal();
                CashRebate cashRebate = new CashRebate(0.8);
                CashReturn cashReturn = new CashReturn(300, 100);

                cashReturn.decorate(cashNormal);
                cashRebate.decorate(cashReturn);
                this.component = cashRebate;
        }
    }

    public double getResult(double price, int num) {
        //根据具体策略调用算法方法
        return this.component.acceptCash(price, num);
    }
}
