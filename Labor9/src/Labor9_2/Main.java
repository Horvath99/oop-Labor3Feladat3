package Labor9_2;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("MyCompany");
        company.hireaAll("employees.csv");
        company.printAll(System.out);
        System.out.println("Alphabetically: ");
        company.SortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getFirstName().compareTo(e2.getFirstName());
            }
        });
        company.printAll(System.out);
        System.out.println("Decreasing salary order: ");
        company.SortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getSalary() > e2.getSalary()) {
                    return -1;
                } else if (e1.getSalary() < e2.getSalary()) {
                    return 1;
                }
                return 0;

            }
        });
        company.printAll(System.out);
        System.out.println("Managers followed by employees, both categories sorted alphabetically: ");
        company.SortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getClass() == e2.getClass()) {
                    if (e1.getFirstName().equals(e2.getFirstName())) {
                        return e1.getLastName().compareTo(e2.getLastName());
                    }
                    return e1.getFirstName().compareTo(e2.getFirstName());
                }
                if (e1.getClass() != Manager.class) {
                    return 1;
                }
                return -1;
            }
        });
        company.printAll(System.out);


    }
}
