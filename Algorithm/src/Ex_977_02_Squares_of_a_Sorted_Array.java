public class Ex_977_02_Squares_of_a_Sorted_Array {
    public static int[] sortedSquares2(int[] A) {
        int N = A.length;
        int j = 0;
        while (j < N && A[j] < 0)
            j++;
        int i = j - 1;

        int[] ans = new int[N];
        int t = 0;

        while (i >= 0 && j < N) {
            if (A[i] * A[i] < A[j] * A[j]) {
                ans[t++] = A[i] * A[i];
                i--;
            } else {
                ans[t++] = A[j] * A[j];
                j++;
            }
        }

        while (i >= 0) {
            ans[t++] = A[i] * A[i];
            i--;
        }
        while (j < N) {
            ans[t++] = A[j] * A[j];
            j++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] a = {-7, -4,-1,0,3,5,10};
        int[] v = sortedSquares2(a);
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);

        }
    }

}
