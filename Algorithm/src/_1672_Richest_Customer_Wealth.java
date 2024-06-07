public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] a) {
        int soKhachHang = a.length;
        int soNganHang = a[0].length;
        int max = 0; //max phải dc gán bằng giá trị nho nhat
        int[] tongTaiSan = new int[soKhachHang];

        for (int i = 0; i < soKhachHang; i++) {
            int tinhTongHangI = 0;
            for (int j = 0; j < soNganHang; j++) {
                tinhTongHangI += a[i][j];
            }
            if (tinhTongHangI > max){
                max = tinhTongHangI;
            }
        }
            return max;
        }



    public static void main(String[] args) {

        int[][] a = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(maximumWealth(a));

    }

}












