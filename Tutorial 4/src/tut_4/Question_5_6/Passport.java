package tut_4.Question_5_6;

public class Passport extends Card{
    private String birthLocation;
    private int expirationYear;

    public Passport(String n, String birthLocation, int expirationYear) {
        super(n);
        this.birthLocation = birthLocation;
        this.expirationYear = expirationYear;
    }

    public Passport(String birthLocation, int expirationYear) {
        this.birthLocation = birthLocation;
        this.expirationYear = expirationYear;
    }

    public String getBirthLocation() {
        return birthLocation;
    }

    public void setBirthLocation(String birthLocation) {
        this.birthLocation = birthLocation;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    @Override
    public String format(){
        return super.format() + "birthLocation: "+ birthLocation + "expirationYear: " +expirationYear;
    }

    @Override
    public boolean isExpired() {
        return false;
    }
}
