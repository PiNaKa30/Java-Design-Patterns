package StructuralPatterns.Composite;

public class ManagerEmployee implements Employee{

    private String name;
    private final String type = "MANAGER";

    public ManagerEmployee() {}

    public ManagerEmployee(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("[" + type + "] " + name);
    }
}
