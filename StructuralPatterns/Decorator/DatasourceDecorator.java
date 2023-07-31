package StructuralPatterns.Decorator;

public class DatasourceDecorator implements Datasource{

    private Datasource datasource;

    public DatasourceDecorator(Datasource datasource) {
        this.datasource = datasource;
    }

    @Override
    public void readData() {
        this.datasource.readData();
    }

    @Override
    public void writeData(String name) {
        this.datasource.writeData(name);
    }

}
