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
public class BubblesortIterative {
    public static void doSwapBubblesort(int arr[]){
        boolean swap=true;
        int index = 0,temp = 0;
        int last = arr.length;
        while(swap){
            swap=false;
            for(index = 0; index < last - 1; index++){
                if(arr[index] > arr[index+1]){
                    temp = arr[index];
                    arr[index] = arr[index+1];
                    arr[index+1] = temp;
                    swap = true;
                }
            }
            last--;
        }
    }
    public static void doLoopBubblesort(int arr[]){
        int i = 1,j = 0,temp = 0;
        for(i = 1; i < arr.length-1; i++){
            for(j = 0; j < arr.length-i; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
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

        BubblesortIterative.doSwapBubblesort(arr);

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

        BubblesortIterative.doLoopBubblesort(arr);

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
