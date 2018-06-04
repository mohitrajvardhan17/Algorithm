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
public class BubblesortGeneric implements SortAlgorithm{


    private static <T extends Comparable<T>> T[] doBubblesort(T[] unsortedArray){
        boolean swap = true;
        while(swap){
            swap = false;
            for(int index = 0;index < unsortedArray.length - 1;index++){
                if(SortUtil.less(unsortedArray[index+1],unsortedArray[index])){
                    swap = SortUtil.swap(unsortedArray,index , index+1);
                }
            }
        }
        return unsortedArray;
    }

    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsortedArray){
        doBubblesort(unsortedArray);
        return unsortedArray;
    }

    public static void main(String[] args){
        Integer arr[] = {8,5,9,4,2,6,7,1,3,0};
        SortUtil.print(arr);
        new BubblesortGeneric().sort(arr);
        SortUtil.print(arr);
   }
    
    
}