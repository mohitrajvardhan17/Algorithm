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
public class MergesortRecursive {
    
    public static int[] mergesort(int arr[]){
        int[] tmp = new int[arr.length];
        doMergesort(arr,tmp,0,arr.length - 1);
        return tmp;
    }
            
    private static void doMergesort(int arr[], int sortedArray[],int leftStart,int rightEnd){
        if(leftStart < rightEnd){
            int mid = (leftStart + rightEnd) / 2;
            doMergesort(arr, sortedArray, leftStart, mid);
            doMergesort(arr, sortedArray, mid + 1, rightEnd);
            mergeHalves(arr, sortedArray, leftStart, rightEnd);
        }
    }

    private static void mergeHalves(int[] arr, int temp[], int leftStart, int rightEnd) {
        int leftEnd = (rightEnd + leftStart) / 2;
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
        
        arr=MergesortRecursive.mergesort(arr);
        
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
