package org.santhoshkumar;

public class InsertionSort {
    int[] values;

    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,3,2,4,1,0};
        InsertionSort is = new InsertionSort();
        is.values = a;
        is.sort();
        is.print();
    }

    // the usual logic is to store the ith element in temp variable and
    // keep moving the items from j to j-1 until the item at j-1 is smaller.
    // In the end move the ith item to jth position.
    public void sort(){
        for(int i =0; i < values.length; i ++){
            int j = i;
            int item = values[j];
            for(; j > 0 && item < values[j-1]; j-- ){
                values[j] = values[j-1];
            }
            values[j]=item;
        }
    }

    private void swap(int from, int to){
        int temp = values[from];
        values[from] = values[to];
        values[to] = temp;
    }

    public void print(){
        for(int i = 0; i < values.length; i++){
            System.out.print(values[i]+" ");
        }
        System.out.println();
    }
}
