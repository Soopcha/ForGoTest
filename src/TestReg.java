import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestReg {
    public static void main(String[] args) {
        String string = "R48FAO00OOA99OKsdsdsdsdsd";
        Pattern pattern = Pattern.compile("((\\D\\d\\D\\D)|(\\D\\d\\d\\D\\D))+"); // создали наш шаблон регулярного выражения
        //Pattern pattern = Pattern.compile("(\\D\\d\\d\\D\\D)+");
        //  .compile - компелирует наше рег выражение
        Matcher mt = pattern.matcher(string); //  pattern.matcher(string) - говорим, что наше рег
        // выражение нужно найти конкретно в строке
        System.out.println(mt.matches()); //метод .matches возваращает буллианоское значение
    }
}
