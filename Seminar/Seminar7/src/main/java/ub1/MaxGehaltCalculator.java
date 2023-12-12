package ub1;

import java.util.List;

public class MaxGehaltCalculator extends Thread {
    private List<Employee> employeeList;
    private int maxGehalt;

    public MaxGehaltCalculator(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public void run() {
        int max = 0;
        for (Employee emp : employeeList) {
            if (emp.getGehalt() > max)
                max = emp.getGehalt();
        }
        maxGehalt = max;
    }

    public int getMaxGehalt() {
        return maxGehalt;
    }
}
