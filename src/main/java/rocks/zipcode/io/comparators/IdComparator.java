package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item> {

    @Override
    public int compare(Item i1,Item i2){
        int itemComp = i1.getId().compareTo(i2.getId());
        return itemComp;
    }

}
