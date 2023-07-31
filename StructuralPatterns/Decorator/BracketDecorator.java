package StructuralPatterns.Decorator;

public class BracketDecorator extends DatasourceDecorator{

    public BracketDecorator(Datasource datasource) {
        super(datasource);
    }

    @Override
    public void readData(){
        super.readData();
    }

    @Override
    public void writeData(String name){
        super.writeData("[" + name + "]");
    }

}
