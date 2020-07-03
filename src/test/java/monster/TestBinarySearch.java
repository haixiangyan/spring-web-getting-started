package monster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBinarySearch {
    private int[] array = {1, 2, 3, 4, 5};

    @Test
    public void correct() {
        int target = 3;

        int index = Utils.binarySearch(array, target);
        int expectedIndex = 2;

        Assertions.assertEquals(index, expectedIndex);
    }

    @Test
    public void fail() {
        int target = 6;

        int index = Utils.binarySearch(array, target);
        int expectedIndex = -1;

        Assertions.assertEquals(index, expectedIndex);
    }
}
