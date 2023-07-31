package StructuralPatterns.Composite;

public class DeveloperEmployee implements Employee{

    private String name;
    private final String type = "DEVELOPER";

    public DeveloperEmployee() {}

    public DeveloperEmployee(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("[" + type + "] " + name);
    }

}
