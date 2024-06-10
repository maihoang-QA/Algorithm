public class Ex_977_01_Squares_of_a_Sorted_Array {
    public static int[] sapXep(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;

    }


    public static int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            result[i] = A[i] * A[i];
        }

        sapXep(result);

        return result;

    }


    public static void main(String[] args) {
        int[] a = {-13, -8, -3, 12, 0, 2, 4, 6, 10};
        int[] v = sortedSquares(a);
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);

        }
    }
}
