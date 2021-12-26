package behavioral.template;

public class TextFileProcessor extends DataProcessor {

    @Override
    public void readData() {
        System.out.println("Reading data from a text file");
    }

    @Override
    public void processData() {
        System.out.println("Processing data from a text file");
    }
}
