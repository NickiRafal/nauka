import java.util.HashMap;
import java.util.Map;

public class OurFavoriteColours  {
    public OurFavoriteColours() {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }

    public String getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getD() {
        return d;
    }

    public String getC() {
        return c;
    }
    private String a;
    private int b;
    private int d;
    private String c;

    public void copy(HashMap<Integer, String> map1,HashMap<Integer, String> map2) {
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            a = entry.getValue();
            b = entry.getKey();
            map2.put(b, a);

        }
    }
        public void listx (HashMap<Integer, String> list){
            for (Map.Entry<Integer, String> entry : list.entrySet()) {
                d = entry.getKey();
                c =entry.getValue();
                System.out.println("Id "+d + " Value "+c);

            }
        }

}







