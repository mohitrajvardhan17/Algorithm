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
public interface SortAlgorithm {

    /**
     *
     * Main method arrays sorting algorithms
     * @param unsortedArray - an array should be sorted
     * @return a sorted array
     */
    public <T extends Comparable<T>> T[] sort(T[] unsortedArray); //Forcing the implementer to implement methord level generic for sorting  
}
