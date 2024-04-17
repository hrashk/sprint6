package praktikum;

public class SalaryService {

    public int calculateSalary(int sales) {
        int percent = 5;
        int salary = sales * percent / 100;
        int salaryLimit = 50_000;
        int test = 40_000;
        if (salary > test) {
            salary = salaryLimit;
        }
        return salary;
    }
}