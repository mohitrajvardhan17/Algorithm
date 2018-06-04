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
public final class SortUtil {
    
    public static <T> boolean swap(T[] Array, int indexOne, int indexTwo){
        T temp = Array[indexOne];
        Array[indexOne] = Array[indexTwo];
        Array[indexTwo] = temp;
        return true;
    }
    
    public static <T extends Comparable<T>> boolean less(T elementOne, T elementTwo){
        return (elementOne.compareTo(elementTwo) < 0);
    }
    
    public static <T> void print(T[] array){
        Boolean first = true;
        for(T element:array){
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
