package main.lucas.factory;


public class Add extends Operation {
    @Override
    public double getResult(double numA, double numB) {
        return numA + numB;
    }
}
