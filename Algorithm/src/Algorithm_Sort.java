public class Algorithm_Sort {
    public static void printArray(int no, int[] a){
        System.out.println(" " +no + ":");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void bubbleSort(int[]a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - i -1; j++) {
                if (a[j] > a[j+1]){
                    isSorted = false;
                    int t =a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
            printArray(i, a);
            if (isSorted==true){
                break;
            }
        }

    }

    public static void selectionSort(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                //Tìm min trong đoạn [i,n]
                if(a[j] < a[minIndex]){
                    minIndex = j;
                }
            }
            //Hoan vị đổi chỗ
            //vì minIndex có giá trị khởi tạo ban đầu là i
            if (minIndex !=i){
                int t = a[i];
                a[i] = a[minIndex];
                a[minIndex] = t;
            }
            printArray(i, a);

        }

    }
    public static void insertionSort(int[] a){
        int n = a.length;
        for (int i = 1; i < n ; i++) {
            //rút ra a[i]
            //int[] a = {6,5,3,1,8,7,2,4}
            //Chọn ra temp = 3 để rút
            int temp = a[i];//-> i= 2
            int j = i-1;//j= 2-1=1
            //vòng lặp sẽ chạy khi j>=0 và 3 < a[j] (3< a[1] = 5)-> tiến hành dịch chuyển thành 6 5 5
            while (j>=0 && temp < a[j]){
                a[j+1] = a[j];
                j--;
            }
            //Chèn quân bài vừa nhấc lên vào vị trí đã tìm (j)
            a[j+1] = temp;

            printArray(i, a);
        }

    }

    public static void main(String[] args) {
        int[] a = {5,3,2,7,8,1,2};
        selectionSort(a);

    }
}
