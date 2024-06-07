public class _88_Merge_Sorted_Array_2_pointers {
    //Xét trên pần tử cuối cùng của 2 mảng: n1[i] và n2[j]
    //k sẽ là vị trí cuối cùng của mảng mới nên mục đích sẽ là a[k] = max(n1[i], n2[j])
    //if(n1[i]>n2[j]){
    //     n1[k] = n1[i];
    //     i--; //i duyệt tiếp đến phần tử cuối t2 của mảng
    //     }
    //else{n1[i]<=n2[j]
           //n1[k] = n2[j];
          //j--;
//-> sau cả 2 bước khi đã gán k vào vị trí cuối của mảng mới thì k-- để duyệt phan tu cuoi tiep
    // vì k luôn dc gắn vào phần tử cuối cùng của mảng mới

    // Tiếp tục so sánh n1[i] với n2[j] (n2[j] là giá trị mới = phần tử liền cuối t2 vì n2[j] cũ đã thỏa mãn và dc gắn vào n1[k] của mảng mới

    //Kiểm tra điều kiện của i và j (nếu âm thì đã nhảy ra khỏi mảng r)
    //if(j<0){
    // n1[k] = n1[i]}
    // i--; n1[k]: vị trí phần tử của mảng mới
    //if(i<0){
    // n1[k] = n2[j]
    // j--;}
    public static void merge(int[] n1, int m, int[] n2, int n) {
        int i = m-1;
        int j = n-1;
        int k = (m+n) - 1;

        while (k>=0) {
            if (j < 0) {
                n1[k] = n1[i];
                i--;
            } else if (i < 0) {
                n1[k] = n2[j];
                j--;
            } else if (n1[i] > n2[j]) {
                n1[k] = n1[i];
                i--;
            } else {
                n1[k] = n2[j];
                j--;

            }
            k--;

        }

    }

    public static void main(String[] args) {
        int[] n1 ={2,3,4,5,0,0,0};
        int[] n2= {0,3,6};
        merge(n1, 4,n2,3);
        System.out.println("DONE");
    }


}
