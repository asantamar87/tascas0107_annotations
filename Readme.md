# Java Exercise: Object Hierarchy and Annotation Usage

This Java project involves creating an object hierarchy with three classes: `Worker`, `OnlineWorker`, and `OnsiteWorker`. Additionally, the project demonstrates the usage of annotations like `@Override` and `@Deprecated`.

## Project Description

### Level 1

#### Exercise 1: Object Hierarchy

1. **Create a hierarchy of objects with three classes:**
    - `Worker`
    - `OnlineWorker`
    - `OnsiteWorker`

2. **Class `Worker`:**
    - The `Worker` class has the following attributes: `firstName`, `lastName`, `hourlyRate`, and a method `calculateSalary()` that receives the number of hours worked as a parameter and multiplies it by the hourly rate to calculate the salary.

3. **Class `OnlineWorker`:**
    - The `OnlineWorker` class overrides the `calculateSalary()` method from `Worker`. It receives the number of hours worked per month and calculates the salary as `hoursWorked * hourlyRate + internetFlatRate`. The flat rate for the internet is a constant in this class.

4. **Class `OnsiteWorker`:**
    - The `OnsiteWorker` class also overrides the `calculateSalary()` method from `Worker`. It receives the number of hours worked per month and calculates the salary as `hoursWorked * hourlyRate + gasolineCost`, where `gasolineCost` is a static attribute in this class.

5. **Main Class:**
    - In the `Main` class, invoke the methods to demonstrate the usage of the `@Override` annotation.

#### Exercise 2: Deprecated Methods

1. **Add some deprecated methods to the child classes (`OnlineWorker` and `OnsiteWorker`).**
    - Use the `@Deprecated` annotation to mark these methods as outdated.

2. **Invoke the deprecated methods from an external class and suppress warnings** for the deprecated methods using the `@SuppressWarnings` annotation.

## Author
[Aldo Santa María]

