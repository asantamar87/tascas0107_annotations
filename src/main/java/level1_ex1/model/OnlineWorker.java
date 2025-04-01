package level1_ex1.model;

public class OnlineWorker extends Worker {

    private static final double INTERNET_FLAT_RATE = 50.0;

    public OnlineWorker(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorkedMonth) {
        return super.calculateSalary(hoursWorkedMonth) + INTERNET_FLAT_RATE;
    }

}
