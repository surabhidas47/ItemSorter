package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator  <T extends Item >implements Comparator<T>{

    @Override
    public int compare(T item1, T item2) {
        return item1.getName().compareTo(item2.getName());
    }
}
