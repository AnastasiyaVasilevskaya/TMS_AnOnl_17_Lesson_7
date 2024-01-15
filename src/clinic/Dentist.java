package clinic;

public class Dentist extends Doctor{
    @Override
    void heal() {
        System.out.println("Лечение зубов");
    }
}
