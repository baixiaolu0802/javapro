/**
 * Created by 13930 on 2020/2/5.
 */
public class searchBin {
    public static void main(String[] args) {
        int[] array = new int[3000];
        for(int i=0;i < array.length;i++){
            array[i]=i+1;
        }
        int a = 1500;
        int index = searchbin(array,a);
        System.out.println(index);
    }
    public static  int searchbin(int[] array,int value){
        int min =0;
        int max =array.length-1;
        int mid;
        int count = 0;
        while(min<=max){
            count++;
            mid = (min+max)/2;
            if(value==array[mid]){
                System.out.println("查找了"+count+"次");
                return  mid;
            }else if(value<array[mid]){
                max = mid-1;
            }else{
                min = mid+1;
            }
        }
        return -1;
    }
}
