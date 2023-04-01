/*
 * @Author: 宋世杰
 * @Date: 2023-03-02 23:45:21
 * @LastEditTime: 2023-03-28 11:11:42
 * @LastEditors: 宋世杰
 * @FilePath: \VSc-Java\Algorithm\Basic\InsertSort.java
 * @Description: 请自行修改描述
 */
package Basic;

public class InsertSort {
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void printArray(int[] arr) {
        if (arr == null)
            return;
        for (int cur : arr) {
            System.out.println(cur);
        }
    }

    public static void main(String[] args) {
        int[] num = { 1, 3, 2, 7, 9, 3, 10 };
        insertSort(num);
        printArray(num);
    }

}
