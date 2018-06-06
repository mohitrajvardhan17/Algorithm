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
public class SelectionsortIterative {
    public static void doSelectionsort(int unsortedArray[]){
        int min = 0;
        int i = 0,j = 0;
        for(i=0;i < unsortedArray.length - 1;i++){
            min = i;
            for(j = i + 1;j < unsortedArray.length;j++){
                if(unsortedArray[j] < unsortedArray[min]){
                    min = j;
                }
            }
            int temp = unsortedArray[min];
            unsortedArray[min] = unsortedArray[i];
            unsortedArray[i] = temp;
        }
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
        
        SelectionsortIterative.doSelectionsort(arr);
        
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
