import javax.swing.*;

public class _88_Merge_Sorted_Array {
    //đê bài:
    //Cho 2 mảng nums1 = [1,2,4,0,0,0] với  số phần tử m = 3
    //nums2 = [3,5,6] vs size n = 3
    // size nums1 = m + n
    //Output: Gộp 2 mảng thành 1 mảng và co sắp xếp từ bé đến lớn [1,2,3,4,5,6]
    public static void merge(int[] n1, int m, int[] n2, int n) {
        for (int ai : n2){
            chenPhanTuVaoMang(ai, n1, m);
            m++;

        }

    }

    private static void chenPhanTuVaoMang(int x, int[] a, int m) {
        // B1: Xác định phần tử k mà a[k] của n1 mà a[k]> a[x] (a[x] của n2). Trong case k có k thì chèn luôn a[x] vào a[m]
        //Nếu có k thì dịch từ n1[k] -> a[m-1] sang phải rồi chèn a[k] = x

        //Xác định k mà a[k] > x ->dùng for i vì quan tâm đến index
         boolean timDuocK = false;
        for (int k = 0; k < m; k++) {
            if (a[k]>x){
                timDuocK= true;
                for (int i = m-1; i >= k; i--) {
                    a[i+1] = a[i];
                }
                a[k]= x;
                break;

            }
        }
         //Sau vong lặp mà vẫn ko tìm được K thì sẽ gán vào phần tử cuối cùng của mảng n1
        if (timDuocK == false){
            a[m] = x;
         }
    }

    public static void main(String[] args) {
        int[] n1 ={2,3,4,5,0,0,0};
        int[] n2= {0,3,6};
        merge(n1, 4,n2,3);
        System.out.println("DONE");

    }
}
