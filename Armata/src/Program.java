

import java.util.LinkedList;

public class Program {
    public static void main(String[] args) {
        LinkedList<Cannon> cannons = new LinkedList<>();

        // Dodawanie obiektów klasy Cannon do kolekcji
        cannons.add(new Cannon(1,false));
        cannons.add(new Cannon(2,true));
        cannons.add(new Cannon(3,false));
        cannons.add(new Cannon(4,true));
        cannons.add(new Cannon(5,false));

        // Ładowanie wszystkich armat
        for (Cannon cannon : cannons) {
            cannon.fire();
        }
    }
}
class Cannon {
    private boolean loaded;
    private int id;

    public boolean isLoaded() {
        return loaded;
    }

    public int getId() {
        return id;
    }

    public Cannon(int id, boolean loaded) {
        this.loaded = loaded;
        this.id = id;
    }
        // Metoda ładująca armaty
    public void fire() {
        if (!loaded) {
            System.out.println("Brak kuli w armacie "+ id +" . Ładuję kulę...");
            loaded = true;
        }else{
            System.out.println("Armata "+ id +" załadowana");
        }

        System.out.println("Armata "+ id +" strzela!");

    }
}
