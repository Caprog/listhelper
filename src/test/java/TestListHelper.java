import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class TestListHelper {

    @Test
    public void should_return_true_if_number_two_exist_in_array() {
        ListHelper listHelper = new ListHelper();
        boolean exist = listHelper.exist(2, new int[] {1,2,3});
        Assert.assertTrue(exist);
    }

    @Test
    public void should_return_true_if_number_two_exist_in_list() {
        ListHelper listHelper = new ListHelper();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        boolean exist = listHelper.exist(2, numbers);

        Assert.assertTrue(exist);
    }
}
