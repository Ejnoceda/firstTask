import java.util.Arrays;

public class StatisticsGiver {

    public static int calculateStats(String a){
        int sum =0;
        int[] arr = new int[]{6, 9, 15, -2, 92, 11};
        Arrays.sort(arr);
        Arrays.toString(arr);


        switch (a){
            case "min":
                return arr[0];
            case "max":
                return arr[arr.length-1];
            case "array Length":
                return arr.length;
        }
        return 0;
    }

}
