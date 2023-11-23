package main.lucas.factory;


public class OperationFactory {
    public static Operation createOperation(String operation) {
        Operation oper = null;
        IFactory factory = null;
        switch (operation) {
            case "+":
            case "-":
                factory = new BaseFactory();
                break;
            case "pow":
                factory = new SeniorFactory();
                break;
        }
        oper = factory.createOperation(operation);
        return oper;
    }
}
