package level1_ex2.models;

import level1_ex2.models.Worker;

public class OnlineWorker extends Worker {

    public static final double INTERNET_FLAT_RATE = 50.0;

    public OnlineWorker(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorkedMonth) {
        return super.calculateSalary(hoursWorkedMonth) + INTERNET_FLAT_RATE;
    }

    @Deprecated
    public void oldMethod() {
        System.out.println("This is an old method in OnlineWorker.");
    }

}
