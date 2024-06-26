public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    //1. Các thao tác vs mảng
  //Duyệt mảng
  //Thêm phần tử vào mảng
  //Xóa phần tử trong mảng
        public static int findNumbers(int[] nums) {
            int bienDem = 0;
          //dùng for each để duyệt mảng
            for(int a: nums){
         //kiểm tra số chữ số của a
         //nếu như số chữ số là chẵn thì tăng biến đếm lên 1
          //mỗi lần đếm đc thì tăng biến đếm lên 1
                int soLuongChuSo = tinhSoChuSo(a);
                if (soLuongChuSo %2 ==0){
                    bienDem++;
                }
            }
            return bienDem;
        }

        private static int tinhSoChuSo(int a) {
            int bienDem = 0;
            int kq = a;
            while (kq!=0){
             //điều kiện: khi nào kết quả còn #0 thì còn chạy vòng while
                kq = a/10;
                a = kq;
                bienDem++;
            }
            return bienDem;
        }

        public static void main(String[] args) {
            int[] nums = {19,288,3675,4};
            System.out.println(findNumbers(nums));





        }

























































































































































































































































































































































































































































































































































































































































































































































































































































































































































































    }
