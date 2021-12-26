package behavioral.template;

public class ProcessorMain {
    public static void main(String[] args) {
        DataProcessor excelData = new ExcelProcessor();
        excelData.readProcessSaveData();

        DataProcessor textData = new TextFileProcessor();
        textData.readProcessSaveData();
    }
}
