package rocks.zipcode.io;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {

    private Item [] items;

    public ItemSorter(Item[] items) {
        this.items=items;

    }

    public Item[] sort(Comparator<Item> comparator) {

        //we need to make a copy bc dont want to change the original
        Item [] sorted = Arrays.copyOf(this.items,items.length);

        Arrays.sort(sorted,comparator);


        return sorted;
    }
}
