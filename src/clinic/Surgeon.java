package clinic;

public class Surgeon extends Doctor{
    @Override
    public void heal(Patient patient) {
        System.out.println("Хирургическое вмешательство. Пациент - " + patient.getName());
    }
}
