import java.util.ArrayList;

public class ArraySeparation{
    public  void separation (ArrayList<String> listaw){
        ArrayList<String> listp = new ArrayList<>();
        ArrayList<String> listn = new ArrayList<>();
        for (int p=0; p<listaw.size(); p++){
            if (listaw.get(p).length() % 2 == 0){
                String v = listaw.get(p);
                listp.add(v);
            }else {
                String v = listaw.get(p);
                listn.add(v);
            }
        }
        for (int q=0; q<listp.size(); q++) {
            System.out.println("Parzyste a to "+listp.get(q).length()+" "+listp.get(q));
        }
        for (int q=0; q<listn.size(); q++) {
            System.out.println("Nieparzyste a to "+listn.get(q).length()+" "+listn.get(q));
        }
        System.out.println("............................................................................");
        System.out.println("Parzystych wpisów w kolejce jet "+listp.size());
        System.out.println("Nieparzystych wpisów w kolejce jet "+listn.size());
    }
}