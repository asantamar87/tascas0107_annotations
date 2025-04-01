package level1_ex1;

import level1_ex1.model.OnlineWorker;
import level1_ex1.model.OnSiteWorker;

public class Main {

    public static void main(String[] args) {
        OnSiteWorker onSiteWorker = new OnSiteWorker("Maria", "Smith", 20.0);
        OnlineWorker onlineWorker = new OnlineWorker("Anna", "Johnson", 18.0);

        int hoursWorked = 160;

        System.out.println("Calculating salaries for " + hoursWorked + " hours worked:");
        System.out.println("Salary of on-site worker: " + onSiteWorker.calculateSalary(hoursWorked));
        System.out.println("Salary of online worker: " + onlineWorker.calculateSalary(hoursWorked));

    }
}
