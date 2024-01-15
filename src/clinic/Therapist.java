package clinic;

import javax.print.Doc;

public class Therapist extends Doctor {
    @Override
    void heal() {
        System.out.println("Лечение по терапевтическому плану");
    }
}
