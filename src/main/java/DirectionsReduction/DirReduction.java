package main.java.DirectionsReduction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirReduction {
    final static List<String> negDirY = Arrays.asList("NORTH", "SOUTH");
    final static List<String> negDirX = Arrays.asList("EAST", "WEST");

    public static String[]dirReduc(String[] arr) {
        ArrayList<String> reduceTrack = new ArrayList<String>();
        for (int i = 0; i <= arr.length - 1; i+=2) {
            if(i == arr.length - 1 )   //end case 1
                if(!reduceTrack.isEmpty())
                    if (isOpposite(reduceTrack.get(reduceTrack.size() - 1), arr[i]))
                        reduceTrack.remove(reduceTrack.size() - 1);
                    else
                        reduceTrack.add(arr[i]);
                else
                    reduceTrack.add(arr[i]);
            else if (!isOpposite(arr[i], arr[i + 1])) {
                if(!reduceTrack.isEmpty() && isOpposite(reduceTrack.get(reduceTrack.size() - 1), arr[i]))
                        reduceTrack.remove(reduceTrack.size() - 1);
                else
                    reduceTrack.add(arr[i]);
                if(isOpposite(reduceTrack.get(reduceTrack.size() - 1), arr[i+1]))
                    reduceTrack.remove(reduceTrack.size() - 1);
                else
                    reduceTrack.add(arr[i+1]);
            }
        }
        String[]res = new String[reduceTrack.size()];
        reduceTrack.toArray(res);
        return res;
    }

    private static boolean isOpposite(String dir1, String dir2){
        return !dir1.equals(dir2) && (negDirX.contains(dir1)&&negDirX.contains(dir2)||negDirY.contains(dir1)&&negDirY.contains(dir2))? true:false;
    }
}
