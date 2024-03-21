package dto;

import java.util.Objects;
import java.util.Random;

public class MedicalBrigade {
    private final Specialization specialization;
    private final MedicalWorker doctor;
    private MedicalWorker paramedic;
    private final int numberOfBrigade;

    public MedicalBrigade(Specialization specialization, MedicalWorker doctor, int numberOfBrigade) {
        this.specialization = specialization;
        this.doctor = doctor;
        this.numberOfBrigade = numberOfBrigade;
    }

    public MedicalBrigade(Specialization specialization, MedicalWorker doctor, MedicalWorker paramedic, int numberOfBrigade) {
        this.specialization = specialization;
        this.doctor = doctor;
        this.paramedic = paramedic;
        this.numberOfBrigade = numberOfBrigade;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public MedicalWorker getDoctor() {
        return doctor;
    }

    public MedicalWorker getParamedic() {
        return paramedic;
    }

    public int getNumberOfBrigade() {
        return numberOfBrigade;
    }

    @Override
    public String toString() {
        return "MedicalBrigade{" +
                "specialization=" + specialization +
                ", doctor=" + doctor +
                ", paramedic=" + paramedic +
                ", numberOfBrigade=" + numberOfBrigade +
                '}';
    }

}
