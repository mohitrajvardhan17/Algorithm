/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Stack;

/**
 *
 * @author emorajv
 */
public class IterativeQuickSort {
    public static void sort(int arr[]){
        Stack<Integer> stk=new Stack();
        int start=0,index=0,end=arr.length-1;
        stk.push(end);
        stk.push(start);
        while(!stk.isEmpty()){
            start = stk.pop();
            end = stk.pop();
            index = IterativeQuickSort.doPartition(arr,start,end);
            if(index - 1 > end){
                stk.push(end);
                stk.push(index-1);
            }
            if(index + 1 < start){
                stk.push(index);
                stk.push(start);
            }   
        }
    }

    public static int doPartition(int arr[],int left ,int right){
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
    public static void main(String[] args) {
        int arr[]={10,9,8,7,6,5,4,3,2,1};
        IterativeQuickSort.sort(arr);
        for(int item:arr){
            System.out.println(item);
        }
    }
}
