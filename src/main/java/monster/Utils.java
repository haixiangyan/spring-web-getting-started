package monster;

public class Utils {
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left + 1 < right) {
            int mid = (left + right) / 2;

            if (array[mid] < target) {
                left = mid;
            } else if (array[mid] > target) {
                right = mid;
            } else {
                return mid;
            }
        }

        if (array[left] == target) {
            return left;
        }
        if (array[right] == target) {
            return right;
        }

        return -1;
    }
}
