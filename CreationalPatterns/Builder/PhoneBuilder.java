package CreationalPatterns.Builder;

public class PhoneBuilder {

    private String company;
    private double ramInGb;
    private double screenLength;
    private double screenWidth;
    private int battery;

    public PhoneBuilder() {}

    public PhoneBuilder setCompany(String company) {
        this.company = company;
        return this;
    }

    public PhoneBuilder setRamInGb(double ramInGb) {
        this.ramInGb = ramInGb;
        return this;
    }

    public PhoneBuilder setScreenLength(double screenLength) {
        this.screenLength = screenLength;
        return this;
    }

    public PhoneBuilder setScreenWidth(double screenWidth) {
        this.screenWidth = screenWidth;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone build(){
        return new Phone(company, ramInGb, screenLength, screenWidth, battery);
    }
}
