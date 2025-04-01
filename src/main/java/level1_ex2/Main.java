package level1_ex2;


import level1_ex2.model.OnSiteWorker;
import level1_ex2.model.OnlineWorker;

public class Main {

    public static void main(String[] args) {
        OnSiteWorker onSiteWorker = new OnSiteWorker("Maria", "Smith", 20.0);
        OnlineWorker onlineWorker = new OnlineWorker("Anna", "Johnson", 18.0);

        int hoursWorked = 160;

        System.out.println("Calculating salaries for " + hoursWorked + " hours worked:");
        System.out.println("Salary of on-site worker: " + onSiteWorker.calculateSalary(hoursWorked));
        System.out.println("Salary of online worker: " + onlineWorker.calculateSalary(hoursWorked));

        System.out.println("\nInvoking deprecated methods:");
        invokeDeprecatedMethods(onSiteWorker, onlineWorker);


    }
    @SuppressWarnings("deprecation")
    public static void invokeDeprecatedMethods(OnSiteWorker onSiteWorker, OnlineWorker onlineWorker) {
        onSiteWorker.oldMethod();
        onlineWorker.oldMethod();
    }
}
