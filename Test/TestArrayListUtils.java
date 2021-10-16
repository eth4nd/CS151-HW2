import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class TestArrayListUtils {
    @Test public void testAverage()
    {
        int average = 2;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        int average2 = ArrayListUtils.mean(arr);
        assertTrue(average == average2);
    }
}
