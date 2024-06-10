public class Ex_485_Array_01_Max_Consecutive_Ones {
    public static int findMaxConsecutiveOnes(int[] a) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a  = {1,0,1,1,0,1,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(a));

    }
}
