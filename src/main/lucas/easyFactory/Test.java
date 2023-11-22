package main.lucas.easyFactory;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        double numA = Double.parseDouble(sc.nextLine());
        System.out.println("请选择运算发");
        String oper = sc.nextLine();
        System.out.println("请输入数字B");
        double numB = Double.parseDouble(sc.nextLine());

        Operation operation = OperationFactory.createOperation(oper);

        double result = operation.getResult(numA, numB);

        System.out.println("计算结果为： " + result);
    }
}
