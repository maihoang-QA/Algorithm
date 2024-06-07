public class _27_Remove_Element {
    public static int removeElement(int[] a, int val) {
        int n = a.length;
        //Tìm xem phần tử nào là pần tử muốn xóa
        for (int i = 0; i < n; ) {
            if (a[i] == val){
                //Thực hiện xóa phần tử a[i]
                for (int j = i; j <= (n-2); j++) {
                     a[j] = a[j+1];
                }
                n--;
            }
            else {//Ko pải xóa tiếp phần tử mới a[i] thì i ms tăng lên 1 để so sánh tiếp vs giá trị val nếu bằng thì xóa
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println(removeElement(a,3));
        System.out.println("DONE");


    }
}
