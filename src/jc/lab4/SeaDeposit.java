package jc.lab4;

import jc.lab3.Deposit;

public class SeaDeposit extends Deposit { //Морське родовище
    private boolean underwaterDrilling;

    public SeaDeposit(String name, int yearOfDiscovery, double costPerTon, double oilProduction, boolean underwaterDrilling) {
        super(name, yearOfDiscovery, costPerTon, oilProduction);
        this.underwaterDrilling = underwaterDrilling;
    }

    public boolean isUnderwaterDrilling() {
        return underwaterDrilling;
    }

    public void setUnderwaterDrilling(boolean underwaterDrilling) {
        this.underwaterDrilling = underwaterDrilling;
    }

    @Override
    public String toString() {
        return super.toString() + (underwaterDrilling ? " | Здійснюється підводне буріння" : " | Не здійснюється підводне буріння");
    }
}