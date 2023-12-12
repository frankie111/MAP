package ub1;

import java.util.List;

public class AverageGehaltCalculator extends Thread {
    private List<Employee> employeeList;
    private float averageGehalt;

    public AverageGehaltCalculator(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public void run() {
        float sum = 0;
        for (Employee emp : employeeList) {
            sum += emp.getGehalt();
        }
        averageGehalt = sum / employeeList.size();
    }

    public float getAverageGehalt() {
        return averageGehalt;
    }
}
