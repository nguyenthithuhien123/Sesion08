package baitap2;

import java.util.Scanner;

public class PartTimeEmployee extends Employee{
private  int workingHour;

    public PartTimeEmployee() {
    }
    public PartTimeEmployee(String name, int paymentPerHour, int workingHour) {
        super(name, paymentPerHour);
        this.workingHour = workingHour;
    }

    public double getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }
    @Override
    public int calculateSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số giờ làm viec:");
        this.workingHour = Integer.parseInt(scanner.nextLine());
        return  (getPaymentPerHour()*this.workingHour);
    }


}
