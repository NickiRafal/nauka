import java.sql.SQLOutput;
import java.util.Random;

public class test {


    public static void main(String[] args) {

        String a = "a";
        Random random = new Random();
        int x = random.nextInt(50);
        System.out.print(x);
        for (int i = 0; i < x; i++) {

           // System.out.print(a);
        }
    }
}