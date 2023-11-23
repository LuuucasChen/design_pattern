package main.lucas.factory;

public class Pow extends Operation{
    @Override
    public double getResult(double numA, double numB) {
        return Math.pow(numA, numB);
    }
}
