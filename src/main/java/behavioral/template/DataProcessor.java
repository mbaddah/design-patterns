package behavioral.template;

public abstract class DataProcessor {

    public void readProcessSaveData() {
        readData();
        processData();
        saveData();
    }

    public abstract void readData();

    public abstract void processData();

    public void saveData() {
        System.out.println("Saving data to DB");
    }

}
