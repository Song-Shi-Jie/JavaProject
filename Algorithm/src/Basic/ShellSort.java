/*
 * @Author: 宋世杰
 * @Date: 2023-03-28 11:10:33
 * @LastEditTime: 2023-03-28 14:37:00
 * @LastEditors: 宋世杰
 * @FilePath: \VSc-Java\Algorithm\Basic\ShellSort.java
 * @Description: 请自行修改描述
 */
package Basic;

public class ShellSort {
    public static void shellSort(int[] arr) {
        int size = arr.length;
        int gap = size / 2;
        while (gap > 0) {
            for (int i = gap; i < size; i++) {
                for (int j = i - gap; j >= 0 && arr[j] > arr[j + gap]; j -= gap) {
                    swap(arr, j, j + gap);
                }
            }
            gap /= 2;
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
        int[] num = { 2, 3, 1, 9, 7, 3, 10 };
        shellSort(num);
        printArray(num);
    }

}
