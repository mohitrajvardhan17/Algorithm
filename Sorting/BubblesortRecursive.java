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
public class BubblesortRecursive {
    public static void doBubblesort(int arr[],int length){
        if(length == 1)
            return;
        for(int index = 0;index < length - 1;index++)
        if(arr[index] > arr[index+1]) {
            int temp = arr[index];
            arr[index] = arr[index+1];
            arr[index+1] = temp;
        }
        doBubblesort(arr, length - 1);
    }
    public static void main(String[] args) {
        int arr[] = {8,5,9,4,2,6,7,1,3,0};
        //int arr[] = {9,8,7,6,5,4,3,2,1,0};
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

        BubblesortRecursive.doBubblesort(arr,arr.length);

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
