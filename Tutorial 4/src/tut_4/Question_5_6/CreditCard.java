package tut_4.Question_5_6;

import java.sql.SQLOutput;

public class CreditCard extends Card{
    private int pinNumber;
    private int number;

    public CreditCard(String n, int pinNumber, int number) {
        super(n);
        this.pinNumber = pinNumber;
        this.number = number;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String format()
    {
        return super.format() + "Pin number: " + pinNumber + "number: " +number;
    }

    @Override
    public boolean isExpired() {
        return false;
    }
}
