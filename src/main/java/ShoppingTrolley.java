import java.util.ArrayList;


public class ShoppingTrolley {
    private ArrayList<String> groceries;


    // constructor


    public ShoppingTrolley() {


        this.groceries = new ArrayList<>();
    }


    public void addToTrolley(String newItem){
        this.groceries.add(newItem);
    }


    public ArrayList<String> getGroceries(){
        return this.groceries;
    }


    public int groceryCount() {
        return this.groceries.size();
    }


    public boolean isInTrolly(String item) {
        return this.groceries.contains(item);
    }
}

