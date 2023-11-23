package main.lucas.factory;


public class Sub extends Operation {
    @Override
    public double getResult(double numA, double numB) {
        return numA - numB;
    }
}
