package controller;

import dto.Specialization;
import service.MedicalStationService;

import java.util.Scanner;

public class ConsoleController {
    public static void main(String[] args) {
        printMenu();

        Scanner scanner = new Scanner(System.in);
        MedicalStationService medicalStationService = new MedicalStationService();
        int command = scanner.nextInt();
        switch (command) {
            case 1 -> {
                fillMedicalBrigade(scanner, medicalStationService);
            }
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
        System.out.print("Выберите пункт меню: ");
    }
}
