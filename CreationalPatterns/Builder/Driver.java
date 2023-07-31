package CreationalPatterns.Builder;

public class Driver {

    public static void main(String[] args) {

        PhoneBuilder phoneBuilder = new PhoneBuilder();
        Phone phone = phoneBuilder.setCompany("Apple").setRamInGb(16).setBattery(5000).build();
        System.out.println(phone);

    }

}
