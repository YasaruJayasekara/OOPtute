package tut_4.Question_5_6;

public class DriverLicense extends Card{
    private int expirationYear;

    public DriverLicense(String n, int expirationYear) {
        super(n);
        this.expirationYear = expirationYear;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    public String format(){
        return super.format() + "expirationYear: " + expirationYear;
    }

    @Override
    public boolean isExpired() {
        return false;
    }
}
