public class Computer {
    private int storage;
    private String printer;


    //Constructor
    public Computer (int currentStorage, String printerModel){
        this.storage = currentStorage;
        this.printer = printerModel;
    }


    public int getCurrentStorage() {
        return this.storage;
    }


    public void setCurrentStorage(int newStorage) {
        this.storage = newStorage;
    }


    public String getPrinter() {
        return this.printer;
    }
    public void setPrinter(String newPrinter){
        System.out.println("Updated Printer to: " + "💥 "+ newPrinter + " 💥");
        this.printer = newPrinter;
    }


    public void updateStorage(int newStorage) {
        this.storage += newStorage;
    }

    public String printMsg() {
        return "Hello World!!!!!!!!";
    }
    //
}
