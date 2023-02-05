import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*    проверка на кол-во кораблей в игре
четыре однопалубных корабля,
три двухпалубных корабля,
два трёхпалубных корабля,
один четырёхпалубный корабль.              всего 10 передаётся
 */
public class Two {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < testCaseCount; i++) {
            String[] lineItems = reader.readLine().split(" ");
            int[] arr = new int[10];
            for (int j = 0; j < 10; j++) {
                arr[j] = Integer.parseInt(lineItems[j]);
            }
            if (checkingShips(arr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }


    }

    public static boolean checkingShips(int[] arr) {
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                one++;
            } else if (arr[i] == 2) {
                two++;
            } else if (arr[i] == 3) {
                three++;
            } else if (arr[i] == 4) {
                four++;
            }
        }
        if (one == 4 && two == 3 && three == 2 && four == 1) {
            return true;
        } else {
            return false;
        }
    }
}
