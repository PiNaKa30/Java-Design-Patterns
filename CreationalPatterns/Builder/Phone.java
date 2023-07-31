package CreationalPatterns.Builder;

public class Phone {

    private String company;
    private double ramInGb;
    private double screenLength;
    private double screenWidth;
    private int battery;

    public Phone(String company, double ramInGb, double screenLength, double screenWidth, int battery) {
        this.company = company;
        this.ramInGb = ramInGb;
        this.screenLength = screenLength;
        this.screenWidth = screenWidth;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone {" +
                "company='" + company + '\'' +
                ", ramInGb=" + ramInGb +
                ", screenLength=" + screenLength +
                ", screenWidth=" + screenWidth +
                ", battery=" + battery +
                '}';
    }
}
