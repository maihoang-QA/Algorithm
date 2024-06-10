public class Ex_1295_Find_Numbers_with_Even_Number_of_Digit {
    public static int findNumbers(int[] a) {
        int count  =0;
        for (int i=0; i<a.length; i++) {
            if (demSoPhanTu(a[i]) % 2 == 0) {
                count++;

            }
        }
        return count;
    }

    public static int demSoPhanTu (int x){
        int count = 0;
        int kq = x;
        while(kq != 0){
            kq = x/10;
            x = kq;
            count++;
        }
        return count;

    }
    public static void main(String[] args) {
        int[] a = {234, 25, 6785, 3332,79};
        System.out.println(findNumbers(a));

    }
}
