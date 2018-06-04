/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;
/**
 *
 * @author emorajv
 */
public class QuicksortGeneric implements SortAlgorithm{

    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsortedArray) {
        doQuicksort(unsortedArray, 0, unsortedArray.length-1);
        return unsortedArray;
    }
    private static <T extends Comparable<T>> void doQuicksort(T[] Array,int left ,int right){
        if(left < right){
            int index = doPartition(Array, left, right);
            doQuicksort(Array, left, index - 1);
            doQuicksort(Array, index, right);
        }
    }
    private static <T extends Comparable<T>> int doPartition(T[] Array, int left, int right){
        int mid = (left + right) / 2;
        T Pivot = Array[mid];
        while(left <= right){
            while(SortUtil.less(Array[left],Pivot)){
                left++;
            }
            while(SortUtil.less(Pivot,Array[right])){
                right--;
            }
            if(left <= right){
                SortUtil.swap(Array,left,right);
                left++;
                right--;
            }
        }
        return left;
    }
    public static void main(String[] args){
        Integer arr[] = {8,5,9,4,2,6,7,1,3,0};
//        Student[] arr = new Student[10];
//        arr[0] = new Student(1,8,"First");
//        arr[1] = new Student(2,5,"Second");
//        arr[2] = new Student(3,1,"Third");
//        arr[3] = new Student(4,3,"Fourth");
//        arr[4] = new Student(5,0,"Fifth");
//        arr[5] = new Student(6,7,"Sixth");
//        arr[6] = new Student(7,6,"Seventh");
//        arr[7] = new Student(8,4,"Eight");
//        arr[8] = new Student(9,2,"Ninth");
//        arr[9] = new Student(10,9,"Tenth");
        
        SortUtil.print(arr);
        new QuicksortGeneric().sort(arr);
        SortUtil.print(arr);
    }
}
