package java15_0419;

import java.util.Arrays;
public class DemoB{

    //    public static void main(String[] args) {
//        int[] array=new int[100];
//        for(int i=0;i<100;i++){
//            array[i]=i+1;
//        }
//        System.out.println(Arrays.toString(array));
//    }
//    public static void transform(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            array[i] *= 2;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] array={1,3,10};
//        transform(array);
//        System.out.println(Arrays.toString(array));
//    }

//    public static int average(int[] array){
//        int sum=0;
//        for(int x:array){
//            sum+=x;
//        }
//       return sum/array.length;
//    }
//
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5};
//        System.out.println(average(arr));
//    }

//    public static void toString(int[] arr){
//        System.out.print("[");
//        for(int i=0;i<arr.length;i++){
//            if(i==arr.length-1){
//                System.out.print(arr[i]);
//            }else
//                System.out.print(arr[i]+",");
//        }
//        System.out.print("]");
//    }
//
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5};
//        toString(arr);
//    }

//    public static int[] copyOf(int[] arr){
//        int[] arr2=new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            arr2[i]=arr[i];
//        }
//        return arr2;
//    }
//
//    public static void main(String[] args) {
//        int[] arr={1,2,3};
//        int[] newarr=copyOf(arr);
//        System.out.println(Arrays.toString(newarr));
//    }

//    public static int binarySearch(int[] arr, int tofind) {
//        int left = 0, right = arr.length - 1;
//        while (left <= right) {
//            int mid = (left + right) / 2;
//            if (arr[mid] < tofind) {
//                left=mid+1;
//            } else if (arr[mid] > tofind) {
//                right=mid-1;
//            } else if (arr[mid] == tofind) {
//                return mid;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 3, 2, 7, 5, 8};
//        System.out.println(binarySearch(arr,5));
//    }

//    public static boolean isSorted(int[] arr){
//        for (int i=0;i<arr.length;i++){
//            if(arr[i]>arr[i+1]){
//                return false;
//            }
//        }
//        return true;
//    }

//    //升序
//    public static void bubbleSort(int[] arr) {
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length -1- i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {9, 5, 2, 7, 3, 6, 8, 0};
//        bubbleSort(arr);
//        System.out.println( Arrays.toString(arr));
//    }

    //未初始化的变量编译不能通过
//    public static void main(String[] args){
//        String s;
//        System.out.println("s="+s);
//    }

}
