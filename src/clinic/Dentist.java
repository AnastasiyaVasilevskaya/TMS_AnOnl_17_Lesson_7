package clinic;

public class Dentist extends Doctor{
    @Override
    public void heal(Patient patient) {
        System.out.println("Лечение зубов. Пациент - "+ patient.getName());
    }
}
