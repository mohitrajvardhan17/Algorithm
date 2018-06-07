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
public class MergesortGeneric implements SortAlgorithm{
    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsortedArray) {
        doMergesort(unsortedArray, 0, unsortedArray.length);
        return unsortedArray;
    }
    
    private <T extends Comparable<T>> void doMergesort(T[] unsortedArray, int leftStart, int rightEnd){
        T[] tmp = (T[]) new Comparable[unsortedArray.length];
        doMergesort(unsortedArray, tmp, 0, unsortedArray.length - 1);
    }
    
    private <T extends Comparable<T>> void doMergesort(T[] unsortedArray, T[] temp, int leftStart, int rightEnd){
        if(leftStart < rightEnd){
            int mid = (leftStart + rightEnd) / 2;
            doMergesort(unsortedArray, temp, leftStart, mid);
            doMergesort(unsortedArray, temp, mid + 1, rightEnd);
            mergeHalves(unsortedArray, temp, leftStart, rightEnd);
        }
    }
    
    private <T extends Comparable<T>> void mergeHalves(T[] unsortedArray , T[] temp, int leftStart, int rightEnd){
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;
        int size = (rightEnd - leftStart) + 1;
        
        int left = leftStart;
        int right = rightStart;
        int index = leftStart;
        
        while(left <= leftEnd && right <= rightEnd){
            if(SortUtil.less(unsortedArray[left], unsortedArray[right])){
                temp[index] = unsortedArray[left];
                left++;
            } else {
                temp[index] = unsortedArray[right];
                right++;
            }
            index++;
        }
        System.arraycopy(unsortedArray, left, temp, index, leftEnd - left + 1);
        System.arraycopy(unsortedArray, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, unsortedArray, leftStart, size);
    }
    
    public static void main(String[] args){
        Integer arr[] = {8,5,9,4,2,6,7,1,3,0};
        SortUtil.print(arr);
        new MergesortGeneric().sort(arr);
        SortUtil.print(arr);
   }
}
