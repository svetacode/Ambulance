package controller;

import dto.MedicalBrigade;
import dto.Specialization;
import service.MedicalStationService;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class ConsoleController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MedicalStationService medicalStationService = new MedicalStationService();
        while (true) {
            printMenu();

            int command = scanner.nextInt();
            switch (command) {
                case 1 -> fillMedicalBrigade(scanner, medicalStationService);
                case 3 -> printBrigadeList(medicalStationService);
                case 0 -> System.exit(0);
            }

        }
    }

    private static void printBrigadeList(MedicalStationService medicalStationService) {
        Collection<MedicalBrigade> medicalBrigadeList = medicalStationService.getBrigadeList();
        System.out.println("Список бригад:");
        for(MedicalBrigade medicalBrigade : medicalBrigadeList){
            System.out.printf("%s - %s %n", medicalBrigade.getNumberOfBrigade(), medicalBrigade);
        }
    }


    private static void fillMedicalBrigade(Scanner scanner, MedicalStationService medicalStationService) {
        System.out.println("Выберите специализацию бригады: ");
        Specialization[] specializations = Specialization.values();
        for (int i = 0; i < specializations.length; i++) {
            Specialization specialization = specializations[i];
            System.out.printf("%s - %s %n", (i+1), specialization);
        }
        int specializationCode = scanner.nextInt();

        System.out.println("Введите данные врача (имя максимальный вес): ");
        scanner.nextLine();
        String doctorInfo = scanner.nextLine();

        System.out.println("Добавить фельдшера (true/false): ");
        boolean isAddParamedic = scanner.nextBoolean();
        String paramedicInfo = null;
        if (isAddParamedic) {
            System.out.println("Введите данные фельдшера (имя максимальный вес): ");
            scanner.nextLine();
            paramedicInfo = scanner.nextLine();
        }

        medicalStationService.addMedicalBrigade(specializationCode, doctorInfo, paramedicInfo);
        System.out.println("Бригада добавлена");


    }

    private static void printMenu() {
        System.out.println("МЕНЮ: ");
        System.out.println("1 - добавить бригаду");
        System.out.println("2 - удалить бригаду");
        System.out.println("3- вывести список всех бригад:");
        System.out.println("0- выход из программы");
        System.out.print("Выберите пункт меню: ");
    }
}
