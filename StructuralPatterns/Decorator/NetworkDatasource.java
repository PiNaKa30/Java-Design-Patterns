package StructuralPatterns.Decorator;

public class NetworkDatasource implements Datasource{

    private String name;

    public NetworkDatasource(String name){
        this.name = name;
    }

    @Override
    public void readData() {
        System.out.println("Reading from network: " + name);
    }

    @Override
    public void writeData(String name) {
        System.out.println("Writing to network: " + name);
    }

}
