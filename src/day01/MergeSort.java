package day01;

public class MergeSort implements SortBase{
    @Override
    public void sort(int[] arr) {
        int length = arr.length;
        sort(arr,0,length);
    }
    public void sort(int[] arr,int L,int R){
        if(L==R) return;
        int mid = L+(R-L)>>1;
        sort(arr,L,mid);
        sort(arr,mid+1,R);
        merge(arr,L,mid,R);
    }
    public void merge(int[] arr,int L,int mid,int R){
        int p1 = L;
        int p2 = mid+1;
        int[] temp = new int[R-L+1];
        int i = 0;
        while(p1<=L&&p2<=R){
            if(p1>=L){
                temp[i++]=arr[p2++];
            }else if(p2>=R){
                temp[i++]=arr[p1++];
            }else if(arr[p1]<=arr[p2]){
                temp[i++]=arr[p1++];
            }else {
                temp[i++]=arr[p2++];
            }
        }
        for(int j=0;j<R-L+1;j++){
            arr[L++] = temp[j];
        }
    }
    public static void main(String[] args) {
        
    }
}
