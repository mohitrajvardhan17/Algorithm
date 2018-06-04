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
public class QuicksortIterative {
    public static void doQuicksort(int arr[],int left,int right){
        Stack<Integer> stack = new Stack<>();
        int start = 0;
        int end = arr.length -1;
        stack.push(start);
        stack.push(end);
        while(!stack.isEmpty()){
            end = stack.pop();
            start = stack.pop();
            int index = doPartion(arr, start, end);
            stack.push(index);
            stack.push(right);
            stack.push(left);
            stack.push(index-1);
        }
    }
    
    private static int doPartion(int arr[],int left,int right){
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
