import java.util.StringJoiner;

/**
 * Created by asus on 20.03.17.
 */
public class LinkedList {
    public ListItem headItem;
    public ListItem curItem;
    public int size = 0;

    public LinkedList(String firstItem){
        this.headItem = new ListItem(firstItem, this.size);
        this.curItem = this.headItem;
        this.size++;
    }
    public LinkedList(){
        this.headItem = new ListItem();
        this.curItem = this.headItem;
    }
    public void add(String valueToAdd) {
        if (this.size > 0) {
            this.curItem.nextItem = new ListItem(valueToAdd, this.size);
            this.curItem = this.curItem.nextItem;
            this.size++;
        } else {
            this.headItem = new ListItem(valueToAdd, this.size);
            this.curItem = this.headItem;
            this.size++;
        }
    }
    public void printAll() {
        ListItem curr = headItem;
        while (curr instanceof ListItem) {
            String tmp = curr.index + 1 == this.size ? "\"" : "\",";
            System.out.println("[" + curr.index + "] => \"" + curr.value + tmp);
            curr = curr.nextItem;
        }
    }
    public int getSize() {
        return this.size;
    }
    public ListItem getItem(int itemIndex) {
        ListItem curr = headItem;
        while (curr instanceof ListItem) {
            if(curr.index == itemIndex)
                return curr;
            curr = curr.nextItem;
        }
        System.out.println("Error! Item not found for index: " + itemIndex);
        return null;
    }
    public String get(int itemIndex) {
        ListItem item_tmp = getItem(itemIndex);
        return item_tmp.value;
    }
    public void set(int itemIndex, String value) {
        ListItem tmp = getItem(itemIndex);
        tmp.value = value;
    }

    class ListItem {
        public String value;
        public int index;
        public ListItem nextItem;
        public ListItem(String value, int size) {
            this.value = value;
            this.index = size;
        }
        public ListItem() {
            this.index = size;
        }
    }
}
