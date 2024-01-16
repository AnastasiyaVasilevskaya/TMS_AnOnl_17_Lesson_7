package clinic;

public class Clinic {
    public static void main(String[] args) {
        Patient patient = new Patient("Алёша");
        TreatmentPlan treatmentPlan1 = new TreatmentPlan(1);
        assignDoctor(patient, treatmentPlan1);
    }

    static void assignDoctor(Patient patient, TreatmentPlan treatmentPlan) {
        Doctor doctor;
        if (treatmentPlan.getPlanCode() == 1) {
            doctor = new Surgeon();
        } else if (treatmentPlan.getPlanCode() == 2) {
            doctor = new Dentist();
        } else {
            doctor = new Therapist();
        }

        doctor.heal(patient);
    }

}
