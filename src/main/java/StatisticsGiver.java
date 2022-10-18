import java.util.Arrays;

public class StatisticsGiver {

    public static long calculateStats(String a) {
        long sum = 0;
        long[] arr = new long[]{6, 9, 15, -2, 92, 11};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        long average =  sum/arr.length;
        switch (a){
            case "min":
                return arr[0];
            case "max":
                return arr[arr.length-1];
            case "array Length":
                return arr.length;
            case "Average":
                return average;
        }
        return 0;
    }

}
