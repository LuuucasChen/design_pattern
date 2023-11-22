package main.lucas.easyFactory;


public class OperationFactory {
    public static Operation createOperation(String operation) {
        Operation oper = null;
        switch (operation) {
            case "+":
                oper = new Add();
                break;
            case "-":
                oper = new Sub();
                break;
        }
        return oper;
    }
}
