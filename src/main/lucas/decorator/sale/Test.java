package main.lucas.decorator.sale;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double price = 0;
        int num = 0;
        double total = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入折扣模式：");
        int discountType = sc.nextInt();
        System.out.println("请输入商品单价：");
        price = sc.nextDouble();
        System.out.println("请输入商品数量：");
        num = sc.nextInt();

        CashContext cashContext = new CashContext(discountType);

        total = cashContext.getResult(price, num);

        System.out.println("商品总价为： " + total);
    }
}
