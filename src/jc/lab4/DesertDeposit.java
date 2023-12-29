package jc.lab4;

import jc.lab3.Deposit;

public class DesertDeposit extends Deposit { //Пустельне родовище
    private int depth;

    public DesertDeposit(String name, int yearOfDiscovery, double costPerTon, double oilProduction, int depth) {
        super(name, yearOfDiscovery, costPerTon, oilProduction);
        this.depth = depth;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return super.toString() + ", Глибина буріння:" + depth + 'м';
    }
}