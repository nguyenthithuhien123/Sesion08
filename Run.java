package baitap2;

public class Run {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Hiên",100);
        System.out.printf("chị %s có tiền lương là %d\n",fullTimeEmployee.getName(),fullTimeEmployee.getPaymentPerHour());
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Hồng",100,6);
        System.out.printf("chị %s có tiền lương là %d",partTimeEmployee.getName(),partTimeEmployee.calculateSalary());

    }
}
