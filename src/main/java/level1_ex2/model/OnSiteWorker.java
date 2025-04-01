package level1_ex2.model;

public class OnSiteWorker extends Worker {
    public static final double FUEL = 100.0; // Static attribute
    public OnSiteWorker(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return super.calculateSalary(hoursWorked) + FUEL;
    }

    @Deprecated
    public void oldMethod() {
        System.out.println("This is an old method in OnSiteWorker.");
    }
}
