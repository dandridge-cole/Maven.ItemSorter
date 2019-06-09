package rocks.zipcode.io.comparators.idcomparator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.comparators.IdComparator;
import rocks.zipcode.io.comparators.NameComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PolymorphismTest {
    @Test
    public void test1() {
        IdComparator nameComparator = new IdComparator(); // this does test what it is supposed to, but the variable name is misleading
        Assert.assertTrue(nameComparator instanceof Comparator);
    }
}
