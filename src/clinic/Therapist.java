package clinic;

import javax.print.Doc;

public class Therapist extends Doctor {
    @Override
    public void heal(Patient patient) {
        System.out.println("Лечение по терапевтическому плану. Пациент - "+ patient.getName());
    }
}
