package main.lucas.factory;

public class BaseFactory implements IFactory{
    @Override
    public Operation createOperation(String operType) {
        Operation oper = null;
        switch (operType) {
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
