package level1_ex1.models;

public class OnSiteWorker extends Worker {
    public static double fuelAllowance = 100.0; // Static attribute
    public OnSiteWorker(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return super.calculateSalary(hoursWorked) + fuelAllowance;
    }

}
