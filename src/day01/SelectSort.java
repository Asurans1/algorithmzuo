package day01;

public class SelectSort implements SortBase{
    @Override
    public void sort(int[] arr) {
        //选择排序 每次选择最小的放到最前面
        int length = arr.length;
        for (int i = 0; i <length; i++) {
            int min = arr[i];
            int index = i;
            for(int j = i+1;j<length;j++){
                if(less(arr[j],min)){
                    min = arr[j];
                    index = j;
                }
            }
            swap(arr,i,index);
        }
    }

    public static void main(String[] args) {
        SortUtil sortUtil = new SortUtil();
        System.out.println(sortUtil.check(1, new SelectSort(), 100, 100));
    }
}
