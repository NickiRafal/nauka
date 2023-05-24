import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;
        class mean {


        }
public class Tables {
    public static void main(String[] args) {
        ArrayList <Integer> informationTechnology = new ArrayList();
        informationTechnology.add(5);
        informationTechnology.add(2);
        informationTechnology.add(3);
        informationTechnology.add(4);
        informationTechnology.add(4);
        informationTechnology.add(3);
        informationTechnology.add(5);
        informationTechnology.add(1);
        informationTechnology.add(3);
        informationTechnology.add(3);
        informationTechnology.add(2);
        informationTechnology.add(3);
        informationTechnology.add(4);
        informationTechnology.add(4);
        informationTechnology.add(5);

        Collections.sort(informationTechnology);
        System.out.println("Lista ocen z informatyki "+informationTechnology);
        informationTechnology.remove(informationTechnology.remove(0));
        informationTechnology.remove(informationTechnology.size()-1);

        double a =0;

        for( int i=0;i<informationTechnology.size();i++){

              a += informationTechnology.get(i);

        }
            double x = informationTechnology.size();
            double mean = a / x;
            System.out.println("Średnia ocen z informatyki bez najniższej i najwyższej to : "+String.format("%.2f", mean));


            // Create and fill the list
            Book book = new Book("janko muzykant", 2022);
            ArrayList<Book> list = new ArrayList<Book>();
            list.add(book);


            for(Book i: list){
            System.out.println(i.tytul+" "+i.rok);
            }
        }
    }


