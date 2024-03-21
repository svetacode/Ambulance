package dto;

public class MedicalBrigade {
    private final Specialization specialization;
    private final MedicalWorker doctor;
    private MedicalWorker paramedic;

    public MedicalBrigade(Specialization specialization, MedicalWorker doctor) {
        this.specialization = specialization;
        this.doctor = doctor;
    }

    public MedicalBrigade(Specialization specialization, MedicalWorker doctor, MedicalWorker paramedic) {
        this.specialization = specialization;
        this.doctor = doctor;
        this.paramedic = paramedic;
    }

}
