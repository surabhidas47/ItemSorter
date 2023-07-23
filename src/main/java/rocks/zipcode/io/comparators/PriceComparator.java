package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator <T extends Item> implements Comparator<T> {
    @Override
    public int compare(T item1, T item2) {
        return item1.getPrice().compareTo(item2.getPrice());
    }

}
