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
public class SelectionsortGeneric implements SortAlgorithm{

    @Override
    public <T extends Comparable<T>> T[] sort(T[] unsortedArray) {
        doSelectionSort(unsortedArray);
        return unsortedArray;
    }
    
    private <T extends Comparable<T>> void doSelectionSort(T[] unsortedArray){
        int min = 0;
        int i = 0,j = 0;
        for(i = 0;i < unsortedArray.length - 1;i++){
            min = i;
            for(j = i + 1;j < unsortedArray.length;j++){
                if(SortUtil.less(unsortedArray[j],unsortedArray[min])){
                    min = j;
                }
            }
            SortUtil.swap(unsortedArray,min,i);
        }
    }
    public static void main(String[] args) {
        Integer arr[] = {8,5,9,4,2,6,7,1,3,0};
        SortUtil.print(arr);
        new SelectionsortGeneric().sort(arr);
        SortUtil.print(arr);
    }    
}
