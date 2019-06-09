package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {

    @Override
    public int compare(Item i1,Item i2){
        int itemComp = i1.getPrice().compareTo(i2.getPrice());
        return itemComp;
    }
}

