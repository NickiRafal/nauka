import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayDeque<String> objects = new ArrayDeque<>();
        MyObject myObject = new MyObject();
        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int x = random.nextInt(50);
            String a = "";
            for (int e = 0; e < x; e++) {
                a += myObject.getValue();
            }
            objects.offerFirst(a);
            list.add(objects.poll());
            System.out.print("Losowa liczba to : " + x + " ");
            System.out.println(a);
        }

        System.out.println("........................................................................");
            ArraySeparation arrayTest = new ArraySeparation();
                arrayTest.separation(list);
    }
}



