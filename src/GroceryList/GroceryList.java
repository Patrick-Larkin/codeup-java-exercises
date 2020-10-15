package GroceryList;

import java.util.ArrayList;

public class GroceryList {
  private String category;
  private ArrayList<String> itemName;
  private ArrayList<Integer> numberOf;

  public GroceryList(String aCategory) {
    this.category = aCategory;
  }

  public GroceryItem() {
    this.itemName = new ArrayList<>();
    this.numberOf = new ArrayList<>();
  }

  public void addItem(String itemName, int numberOf) {
    numberOf.add(numberOf);
  }

}
