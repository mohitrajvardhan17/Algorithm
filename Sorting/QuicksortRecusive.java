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
public class QuicksortRecusive {
    public static void doQuicksort(int arr[],int left ,int right){
        if(left < right){
            int index = doPartion(arr, left, right);
            doQuicksort(arr, left, index-1);
            doQuicksort(arr, index, right);
        }
    }
    private static int doPartion(int arr[],int left ,int right){
        int mid = (left + right) / 2;
        int pivot = arr[mid];
        while(left <= right){
            while(arr[left] < pivot){
                left++;
            }
            while(arr[right] > pivot){
                right--;
            }
            if(left <= right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }
    
    public static void main(String[] args){
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
        QuicksortRecusive.doQuicksort(arr, 0, arr.length-1);
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
