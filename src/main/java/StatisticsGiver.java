import java.util.Arrays;

public class StatisticsGiver {

    public static int calculateStats(String a){

        int[] arr = new int[]{6, 9, 15, -2, 92, 11};
        Arrays.sort(arr);
        Arrays.toString(arr);

        if (a == "min"){
            return arr[0];
        } else if (a== "max"){
            return arr[arr.length-1];
        }
        return 0;
    }

}
