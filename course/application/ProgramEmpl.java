package application;

import java.util.Scanner;

import entities.Employee;

public class ProgramEmpl {
    public static void main(String args[]) {
        Scanner tc = new Scanner(System.in);
        Employee x = new Employee();

        System.out.print("Name: ");
        x.name = tc.nextLine();
        System.out.print("Gross salary: ");
        x.grossSalary = tc.nextDouble();
        System.out.print("Tax: ");
        x.tax = tc.nextDouble();

        x.netSalary();

        System.out.println("Employee: " + x);
        System.out.println("Which percentage to increase salary?");
        double percentage = tc.nextDouble();
        x.increaseSalary(percentage);
        System.out.println("Update data: " + x);

        tc.close();

    }
}
