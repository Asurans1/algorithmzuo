package day01;

public class BubbleSort implements SortBase{
    @Override
    public void sort(int[] arr) {
        int length = arr.length;
        for(int i=0;i<length;i++){
            //每次把最大的浮上去
            for(int j=0;j<length-i-1;j++){
                if(less(arr[j+1],arr[j])) swap(arr,j,j+1);
            }
        }
    }

    public static void main(String[] args) {
        SortUtil sortUtil = new SortUtil();
        System.out.println(sortUtil.check(50, new BubbleSort(), 100, 100));
    }
}
