    public static void radixSort(int[] nums) {

        int max = max(nums);
        for (int i = 1; max / i > 0; i *= 10) {
            countSort(nums, i);
        }
    }

    private static void countSort(int[] arr, int exp) {
        int[] count = new int[10];

        for (int val : arr)
            count[val / exp % 10]++;

        for (int i = 1; i < count.length; i++)
            count[i] += count[i - 1];

        int[] ret = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            int digitValue = arr[i] / exp % 10;
            ret[count[digitValue] - 1] = arr[i];
            count[digitValue] -= 1;
        }

        System.arraycopy(ret, 0, arr, 0, arr.length);
    }

    private static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
