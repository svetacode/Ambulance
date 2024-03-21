package service;

import dto.MedicalBrigade;
import dto.Person;
import dto.Specialization;

import java.util.ArrayList;
import java.util.List;

public class MedicalStationService {
    private final List<MedicalBrigade> medicalBrigadeList;

    public MedicalStationService() {
        medicalBrigadeList = new ArrayList<>();
    }


    public void addMedicalBrigade(int specializationCode, String doctorInfo, String paramedicInfo) {
        MedicalBrigade newBrigade;
        if (paramedicInfo!=null){
            newBrigade = new MedicalBrigade(
                    Specialization.values()[specializationCode-1],
                    new Person(doctorInfo),
                    new Person(paramedicInfo)
            );
        } else {
            newBrigade = new MedicalBrigade(
                    Specialization.values()[specializationCode-1],
                    new Person(doctorInfo)
            );
        }
        medicalBrigadeList.add(newBrigade);
    }
}
