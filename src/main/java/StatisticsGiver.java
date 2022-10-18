import java.lang.reflect.Array;
import java.util.Arrays;

public class StatisticsGiver {

    public static int calculateStats(int[] arr){
        int min =0;

        arr = new int[]{6, 9, 15, -2, 92, 11};
        Arrays.sort(arr);
        Arrays.toString(arr);

        return min = arr[0];
    }

}
