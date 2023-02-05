import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
либо автомобильный номер имеет вид буква-цифра-цифра-буква-буква (примеры корректных номеров первого вида: R48FA, O00OO, A99OK);
либо автомобильный номер имеет вид буква-цифра-буква-буква (примеры корректных номеров второго вида: T7RR, A9PQ, O0OO).
 */

public class Three {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int testCaseCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < testCaseCount; i++) {
            String str = reader.readLine();
            Pattern pattern = Pattern.compile("((\\D\\d\\D\\D)|(\\D\\d\\d\\D\\D))+");
            Pattern pattern2 = Pattern.compile("((\\D\\d\\D\\D)|(\\D\\d\\d\\D\\D))");

            Matcher mt = pattern.matcher(str);
            Matcher mt2 = pattern2.matcher(str);
            if (mt.matches()){
                while (mt2.find()){
                    System.out.print(mt2.group());
                    System.out.print(" ");
                }
                System.out.println();
            } else {
                System.out.println("-");
            }
        }

    }
}
