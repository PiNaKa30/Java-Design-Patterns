package StructuralPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee{

    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public void showDetails() {
        for(Employee employee: employeeList)
            employee.showDetails();
    }

    public void addEmployee(Employee emp)
    {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp)
    {
        employeeList.remove(emp);
    }

}
