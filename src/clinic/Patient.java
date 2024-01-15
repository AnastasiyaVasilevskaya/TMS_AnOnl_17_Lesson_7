package clinic;

public class Patient {
    int treatmentPlan;

    public Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    void assignDoctor() {
        Doctor doctor;

        if (treatmentPlan == 1) {
            doctor = new Surgeon();
        } else if (treatmentPlan == 2) {
            doctor = new Dentist();
        } else {
            doctor = new Therapist();
        }

        doctor.heal();
    }
}
