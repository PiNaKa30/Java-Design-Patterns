package StructuralPatterns.Decorator;

public class Driver {

    public static void main(String[] args) {

        final String someText = "Some Text";

        DatasourceDecorator datasourceDecorator = new BracketDecorator(
                new CaseDecorator(new FileDatasource(someText)));
        datasourceDecorator.readData();
        datasourceDecorator.writeData(someText);

        datasourceDecorator = new BracketDecorator(
                new CaseDecorator(new NetworkDatasource(someText)));
        datasourceDecorator.readData();
        datasourceDecorator.writeData(someText);

    }

}
