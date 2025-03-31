package level1_ex2.models;

public class Worker {

    protected String firstName;
    protected String lastName;
    protected double hourlyRate;

    public Worker(String firstName, String lastName, double hourlyRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(int hoursWorked) {
        return hoursWorked * hourlyRate;
    }



}
