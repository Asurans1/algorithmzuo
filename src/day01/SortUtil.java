package day01;

import java.util.Arrays;
import java.util.Random;

public class SortUtil {
    //对数器
    private int[] generateArray(int size,int maxValue){
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = (int)(Math.random()*maxValue);
        }
        return array;
    }
    public boolean check(int counts,SortBase sort,int size,int maxValue) {
        for(int i=0;i<counts;i++){
            int[] array = generateArray(size, maxValue);
            int[] copy = Arrays.copyOf(array, size);
            sort.sort(array);
            Arrays.sort(copy);
            for (int j = 0; j <size; j++) {
                System.out.println(array[j]+"array");
                System.out.println(copy[j]+"copy");
                if(array[j]!=copy[j]) return false;
            }
        }
        return true;
    }
}
