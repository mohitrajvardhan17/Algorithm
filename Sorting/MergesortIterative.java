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
public class MergesortIterative {
    
    public static void mergesort(int arr[]){
        doMergesort(arr, new int[arr.length], 0, arr.length);
    }

    private static void doMergesort(int[] arr, int[] temp, int leftStart, int rightEnd){
        int current;
        int left_start;
        int arraySize = arr.length - 1;
        for (current = 1; current < arraySize; current += current) {
            for (left_start = leftStart; left_start < arraySize; left_start += 2 * current) {
                int mid = left_start + current - 1;
                
                int right = Math.min(left_start + 2 * current - 1, arraySize);
                mergeHalves(arr, temp, mid, left_start, right);
            }
        }
   }
    
 
    private static void mergeHalves(int[] arr, int temp[], int mid, int leftStart, int rightEnd) {
        int leftEnd = mid;
        if(mid > rightEnd){
            leftEnd = (rightEnd + leftStart) / 2;
        }
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;
        
        int left = leftStart;
        int right = rightStart;
        int index = leftStart;
        
        while(left <= leftEnd && right <= rightEnd){
            if(arr[left] <= arr[right]){
                temp[index] = arr[left];
                left++;             
            } else {
                temp[index] = arr[right];
                right++;
            }
            index++;
        }
        System.arraycopy(arr, left, temp, index, leftEnd - left + 1);
        System.arraycopy(arr, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, arr, leftStart, size);
    }
    
    public static void main(String[] args) {
        int arr[] = {8,5,9,4,2,6,7,1,3,0};
        Boolean first = true;
        for(int element:arr){
            if(first){
                System.out.print(element);
                first = false;
            } else {
                System.out.print(","+element);
            }
        }
        System.out.println("");
        
        MergesortIterative.mergesort(arr);
        
        first = true;
        for(int element:arr){
            if(first){
                System.out.print(element);
                first = false;
            } else {
                System.out.print(","+element);
            }
        }
        System.out.println("");
        
    }    

}
