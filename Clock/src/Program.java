import java.util.LinkedList;

public class Program {
    public static void main(String[] args) {
        LinkedList<Clock> clocks = new LinkedList<>();

        // Tworzenie i dodawanie obiektów klasy Clock do kolekcji
        clocks.add(new Clock(12, 0));
        clocks.add(new Clock(9, 30));
        clocks.add(new Clock(6, 45));

        // Przesuwanie godziny o jedną minutę do przodu dla każdego zegara
        for (Clock clock : clocks) {
            clock.moveForward();
        }

        // Wyświetlanie zaktualizowanych godzin
        for (Clock clock : clocks) {
            System.out.println(clock);
        }
    }
}

class Clock {
    private int hours;

    private int minutes;

    public Clock(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public void moveForward() {
        minutes++;
        if (minutes >= 60) {
            minutes = 0;
            hours++;
            if (hours >= 24) {
                hours = 0;
            }
        }
    }

    @Override
    public String toString() {
        String hoursString = String.format("%02d", hours);
        String minutesString = String.format("%02d", minutes);
        return hoursString + ":" + minutesString;
    }
}
