package StructuralPatterns.Composite;

public class Driver {

    public static void main(String[] args) {

        CompanyDirectory companyDirectory =  new CompanyDirectory();

        CompanyDirectory developersDirectory = new CompanyDirectory();
        Employee e1 = new DeveloperEmployee("E1");
        Employee e2 = new DeveloperEmployee("E2");
        developersDirectory.addEmployee(e1);
        developersDirectory.addEmployee(e2);

        CompanyDirectory managersDirectory = new CompanyDirectory();
        Employee e3 = new ManagerEmployee("M1");
        Employee e4 = new ManagerEmployee("M2");
        managersDirectory.addEmployee(e3);
        managersDirectory.addEmployee(e4);

        companyDirectory.addEmployee(developersDirectory);
        companyDirectory.addEmployee(managersDirectory);
        companyDirectory.showDetails();

    }

}
