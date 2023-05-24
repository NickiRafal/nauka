public interface Bankomat {
    default void connect() {
        System.out.println("Nastąpiło połączenie ");
    }
    String Wplata();
    String Wyplata();
    static void end () {
        System.out.println(" Połączenie zostało zakończone ");

    }
}
