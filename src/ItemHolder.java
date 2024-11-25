import java.util.LinkedList;

public class ItemHolder {
    LinkedList<Integer> items;

    public ItemHolder() {
        items = new LinkedList<Integer>();
    }

    public int getItem() {
        return items.size(); // Returns number of items
    }

    public void addItem(int itemNumber) {
        if (!items.contains(itemNumber)) {  // Only add if not already present
            items.add(itemNumber);
        }
    }
}