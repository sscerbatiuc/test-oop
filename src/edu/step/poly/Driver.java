package edu.step.poly;

public class Driver extends Employee {

    private String drivingLicense;

    public Driver(String name, String surname, String drivingLicense) {
        super(name, surname);
        this.drivingLicense = drivingLicense;
    }

    public void presentYourself() {
        super.presentYourself();
        ConsoleUtil.out("I drive the following vehicles");
        ConsoleUtil.out(this.drivingLicense);
    }
}
