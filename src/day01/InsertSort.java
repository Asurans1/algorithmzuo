package day01;

public class InsertSort implements SortBase {
    @Override
    public void sort(int[] arr) {
        int length = arr.length;
        for(int i=0;i<length;i++){
            for(int j=i;j>0&&less(arr[j],arr[j-1]);j--){
                swap(arr,j,j-1);
            }
        }
    }
    public static void main(String[] args) {
        SortUtil sortUtil = new SortUtil();
        System.out.println(sortUtil.check(50, new InsertSort(), 100, 100));
    }
}
