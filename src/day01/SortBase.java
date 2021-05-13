package day01;

interface SortBase {
    default void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    default boolean less(int a,int b){
        if(a<b) return true;
        return false;
    }
    public void sort(int[] arr);

}
