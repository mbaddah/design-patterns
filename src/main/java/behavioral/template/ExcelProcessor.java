package behavioral.template;

public class ExcelProcessor extends DataProcessor {

    @Override
    public void readData() {
        System.out.println("Reading excel data");
    }

    @Override
    public void processData() {
        System.out.println("processing excel data");
    }

}
