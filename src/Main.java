import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            StringReverter strnaobarot;
            System.out.print("Слово = ");
            String soz=scan.next();
            StringBuilder sb = new StringBuilder(soz);
            strnaobarot = str -> sb.reverse().toString();
            System.out.println(" Итог = " + strnaobarot.revert(soz));
    }
}
@FunctionalInterface
interface StringReverter<T> {
    String revert(String str);
}
