import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Four {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < testCaseCount; i++) {
            int numberOfAthletes = Integer.parseInt(reader.readLine());
            String[] lineItems = reader.readLine().split(" ");
            int[] arr = new int[numberOfAthletes];
            for (int j = 0; j < numberOfAthletes; j++) {
                arr[j] = Integer.parseInt(lineItems[j]);
            }
            int [] nomber = (sort(arr));
            for (int j = 0; j < nomber.length; j++){
                System.out.print(nomber[j] + " ");
            }
        }
    }

    public static int[] sort(int[] arr) {
        int[] arrSort = Arrays.stream(arr).sorted().toArray();

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();  //кладём в мапу места    секунды забега - место
        int count = 0;
        for (int i = 0; i < arrSort.length; i++){
            if (i == 0){
                map.put(arrSort[i], i+1);
            } else {
                if ((arrSort[i] - arrSort[i-1]) <= 1) {
                    ++count;
                    map.put(arrSort[i], i-count+1);

                } else {
                    map.put(arrSort[i], i+1);
                    count = 0;
                }
            }
        }

        int[] masMest = new int[arr.length];
        for (int i = 0; i< arr.length; i++){
            masMest[i] = map.get(arr[i]);
        }

        return masMest;
    }

}
