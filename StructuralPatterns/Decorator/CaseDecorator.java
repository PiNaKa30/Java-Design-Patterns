package StructuralPatterns.Decorator;

public class CaseDecorator extends DatasourceDecorator{

    public CaseDecorator(Datasource datasource) {
        super(datasource);
    }

    @Override
    public void readData(){
        super.readData();
    }

    @Override
    public void writeData(String name){
        super.writeData(name.toUpperCase());
    }

}
