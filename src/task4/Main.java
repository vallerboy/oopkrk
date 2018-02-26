package task4;

public class Main {
    public static void main(String[] args) {

        Employee employeeOskar = new Employee("Arek", "Głowacki", 1990, 7);
        Employee employeeOskar1 = new Employee("Arek", "Głowacki", 1990, 7);
        Employee employeeOskar2 = new Employee("Arek", "Głowacki", 1990, 7);

        Company company = new Company();

        company.setBoss(employeeOskar);
        company.setCoBoss(employeeOskar1);
        company.setCto(employeeOskar2);

        System.out.println("Szef: " + company.getBoss());
    }
}
