package StructuralPatterns.Decorator;

public class FileDatasource implements Datasource{

    private String name;

    public FileDatasource(String name){
        this.name = name;
    }

    @Override
    public void readData() {
        System.out.println("Reading from file: " + name);
    }

    @Override
    public void writeData(String name) {
        System.out.println("Writing to file: " + name);
    }

}
