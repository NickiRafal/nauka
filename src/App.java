public class App implements Bankomat {

    public static void main(String[] args) {
        App bank = new App() ;
        bank.connect();
        System.out.println( bank.Wplata());
        System.out.println( bank.Wyplata());
        Bankomat.end();
    }

    @Override
    public String Wplata() {
        return "Dokonano Wpłaty";
    }

    @Override
    public String Wyplata() {
        return "Dokonano Wypłaty";
    }
}


