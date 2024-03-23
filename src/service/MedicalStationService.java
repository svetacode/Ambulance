package service;

import dto.MedicalBrigade;
import dto.Person;
import dto.Specialization;

import java.util.*;

public class MedicalStationService {
    private final Map<Integer, MedicalBrigade> medicalBrigadeMap;

    private final Random random = new Random();

    public MedicalStationService() {
        medicalBrigadeMap = new HashMap<>();
    }


    public void addMedicalBrigade(int specializationCode, String doctorInfo, String paramedicInfo) {
        MedicalBrigade newBrigade;
        if (paramedicInfo != null) {
            newBrigade = new MedicalBrigade(
                    Specialization.values()[specializationCode - 1],
                    new Person(doctorInfo),
                    new Person(paramedicInfo),
                    random.nextInt()
            );
        } else {
            newBrigade = new MedicalBrigade(
                    Specialization.values()[specializationCode - 1],
                    new Person(doctorInfo),
                    random.nextInt()
            );
        }
        medicalBrigadeMap.put(newBrigade.getNumberOfBrigade(), newBrigade);
    }

    public Collection<MedicalBrigade> getBrigadeList() {
        return medicalBrigadeMap.values();
    }

    public boolean deleteMedicalBrigade(int brigadeNumber) {
        if (medicalBrigadeMap.containsKey(brigadeNumber)) {
            medicalBrigadeMap.remove(brigadeNumber);
            return true;
        }
        return false;
    }
}
