import java.util.Random;
public class MyMain {
    

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int leng= arr.length;
        int[] array = new int[leng];
        int first = 0;
        int second = leng/2;
        int count=0;
        for (int i =0;i<leng/2; i++){
            array[count] = arr[first];
            array[count+1]=arr[second];
            first++;
            second++;
            count=count+2;
        }
        return array;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        int leng= arr.length;
        int[] array=new int[leng];
        array=arr;
        
        for (int i=0; i<leng-1; i++){
            int random =(int) (Math.random()*leng);
            int holder = array[i];
            array[i]=array[random];
            array[random]=holder;

        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{ 1,2,3,4,5,6,7,8,9,10};
        System.out.println(selectionShuffle(array));
        System.out.println(perfectShuffle(array));
        
    }
}
