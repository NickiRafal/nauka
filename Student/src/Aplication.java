import java.util.*;


public class Aplication {
    public static void main(String[] args) {
        Student student1 = new Student("Krzysiek", 2, 5, 4, 3, 5);
        Student student2 = new Student("Marek", 5, 3, 3, 5, 5);
        Student student3 = new Student("Daniel", 1, 2, 4, 4, 5);
        Student student4 = new Student("Łukasz", 4, 5, 4, 5, 5);

        ArrayList<Student> student1x = new ArrayList<Student>();

        student1x.add(student1);
        student1x.add(student2);
        student1x.add(student3);
        student1x.add(student4);
        System.out.println();
        System.out.println("Dane uczniów");
        System.out.println();
        int z =0;
        for (Student i : student1x) {
            z++;
            double mean = (i.grade1+ i.grade2+ i.grade3+ i.grade4+ i.grade5) / 5.0;
            System.out.println(z+" "+i.name +" Oceny "+ i.grade1 +" "+ i.grade2 +" "+ i.grade3 +" "+ i.grade4 +" "+ i.grade5);

            HashMap<String,Double> hashMap = new HashMap();
            hashMap.put(i.name,mean);
            Set <String> keys = hashMap.keySet();
            Collection <Double> value = hashMap.values();
            System.out.println("Uczeń "+keys +" ma średnią " +value);
            System.out.println(".........................................");
        }
        System.out.println();
        System.out.println("Zamiana zmiennych");
        int a = 3;
        int b =5;
        System.out.println("Zmienne przed zamianą a="+a+" b="+b);
        a = a - b;
        b = b + a;
        a = b - a;
        System.out.println("Zmienne po zamianie a="+a+" b="+b);
    }

}

