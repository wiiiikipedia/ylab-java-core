import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {
    @Test
    public void test() throws Exception {
        int[] arr = new int[] {5,6,3,2,5,1,4,9};

        for (int i = 0; i < arr.length-1; ++i) {
            for (int j = 0; j < arr.length-i-1; ++j) {
                if (arr[j] < arr[j+1]) {
                    int item = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = item;
                }
            }
        }

        int [] arr_expected = new int[] {9, 6, 5, 5, 4, 3, 2, 1};

        Assert.assertArrayEquals(arr_expected, arr);
    }
}
