package main.lucas.factory;


public class SeniorFactory implements IFactory{
    @Override
    public Operation createOperation(String operType) {
        Operation oper = null;
        switch (operType) {
            case "pow":
                oper = new Pow();
                break;
        }
        return oper;
    }
}
