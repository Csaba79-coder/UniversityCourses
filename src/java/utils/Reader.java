package utils;

import courses.Specializations;
import model.NameOfCourses;
import model.UnitType;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Reader {

    static List<Specializations> allSpecialization = new ArrayList<>();
    static List<Specializations> specializationsEnglish = new ArrayList<>();
    static List<Specializations> specializationsGerman = new ArrayList<>();
    static List<Specializations> specializationsComputerLibrarian = new ArrayList<>();
    static List<Specializations> specializationsJapan = new ArrayList<>();
    static List<Specializations> specializationsClassicalPhilology = new ArrayList<>();
    static List<Specializations> specializationsHungarian = new ArrayList<>();
    static List<Specializations> specializationsScandinavian = new ArrayList<>();
    static List<Specializations> specializationsHistory = new ArrayList<>();
    static List<Specializations> specializationsOther = new ArrayList<>();


    public static void Buffer(String fileName) throws IOException {
        int index = 0;
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        for (String line; (line = bufferedReader.readLine()) != null; ) {
            // this line was needed to read correctly the line! as the first line has no data!
            if (line.length() > 1) {
                String[] parts = line.split(";");
                // TODO creat lists (instantiaton!!!)
                if (NameOfCourses.ENGLISH_STUDIES.HUN_NAME.toLowerCase().equals(parts[0])) {
                    specializationsEnglish.add(new Specializations(NameOfCourses.ENGLISH_STUDIES, parts[1], parts[2],
                            UnitType.getEnumUnitType(parts[3]), semesterList(parts[4]), Integer.parseInt(parts[5]), createArrayOfPreStudies(parts[6])));
                } else if (NameOfCourses.GERMAN_STUDIES.HUN_NAME.toLowerCase().equals(parts[0])) {
                    specializationsGerman.add(new Specializations(NameOfCourses.GERMAN_STUDIES, parts[1], parts[2],
                            UnitType.getEnumUnitType(parts[3]), semesterList(parts[4]), Integer.parseInt(parts[5]), createArrayOfPreStudies(parts[6])));
                } else if (NameOfCourses.COMPUTER_LIBRARIAN.HUN_NAME.toLowerCase().equals(parts[0])) {
                    specializationsComputerLibrarian.add(new Specializations(NameOfCourses.COMPUTER_LIBRARIAN, parts[1], parts[2],
                            UnitType.getEnumUnitType(parts[3]), semesterList(parts[4]), Integer.parseInt(parts[5]), createArrayOfPreStudies(parts[6])));
                } else if (NameOfCourses.JAPAN_STUDIES.HUN_NAME.toLowerCase().equals(parts[0])) {
                    specializationsJapan.add(new Specializations(NameOfCourses.JAPAN_STUDIES, parts[1], parts[2],
                            UnitType.getEnumUnitType(parts[3]), semesterList(parts[4]), Integer.parseInt(parts[5]), createArrayOfPreStudies(parts[6])));
                } else if (NameOfCourses.CLASSICAL_PHILOLOGY.HUN_NAME.toLowerCase().equals(parts[0])) {
                    specializationsClassicalPhilology.add(new Specializations(NameOfCourses.CLASSICAL_PHILOLOGY, parts[1], parts[2],
                            UnitType.getEnumUnitType(parts[3]), semesterList(parts[4]), Integer.parseInt(parts[5]), createArrayOfPreStudies(parts[6])));
                } else if (NameOfCourses.HUNGARIAN_STUDIES.HUN_NAME.toLowerCase().equals(parts[0])) {
                    specializationsHungarian.add(new Specializations(NameOfCourses.HUNGARIAN_STUDIES, parts[1], parts[2],
                            UnitType.getEnumUnitType(parts[3]), semesterList(parts[4]), Integer.parseInt(parts[5]), createArrayOfPreStudies(parts[6])));
                } else if (NameOfCourses.SCANDINAVIAN_STUDIES.HUN_NAME.toLowerCase().equals(parts[0])) {
                    specializationsScandinavian.add(new Specializations(NameOfCourses.SCANDINAVIAN_STUDIES, parts[1], parts[2],
                            UnitType.getEnumUnitType(parts[3]), semesterList(parts[4]), Integer.parseInt(parts[5]), createArrayOfPreStudies(parts[6])));
                } else if (NameOfCourses.HISTORY.HUN_NAME.toLowerCase().equals(parts[0])) {
                    specializationsHistory.add(new Specializations(NameOfCourses.HISTORY, parts[1], parts[2],
                            UnitType.getEnumUnitType(parts[3]), semesterList(parts[4]), Integer.parseInt(parts[5]), createArrayOfPreStudies(parts[6])));
                } else {
                    specializationsOther.add(new Specializations(NameOfCourses.OTHER, parts[1], parts[2],
                            UnitType.getEnumUnitType(parts[3]), semesterList(parts[4]), Integer.parseInt(parts[5]), createArrayOfPreStudies(parts[6])));
                }
                // System.out.println(line);
            }
        }
    }

    private static List<Integer> semesterList(String string){
        List<Integer> myList = new ArrayList<>();
        String[] parts = string.split("\\|");
        for (int i = 0; i < parts.length; i++) {
            myList.add(Integer.parseInt(parts[i]));
        }
        return myList;
    }

    private static List<String> createArrayOfPreStudies(String string) {
        String[] parts = string.split("\\|");
        return new ArrayList<>(Arrays.asList(parts));
    }

    public static List<Specializations> getSpecializationsEnglish() {
        return specializationsEnglish;
    }

    public static List<Specializations> getAllSpecialization() {
        return allSpecialization;
    }

    public static void setAllSpecialization(List<Specializations> allSpecialization) {
        Reader.allSpecialization = allSpecialization;
    }

    public static void setSpecializationsEnglish(List<Specializations> specializationsEnglish) {
        Reader.specializationsEnglish = specializationsEnglish;
    }

    public static List<Specializations> getSpecializationsGerman() {
        return specializationsGerman;
    }

    public static void setSpecializationsGerman(List<Specializations> specializationsGerman) {
        Reader.specializationsGerman = specializationsGerman;
    }

    public static List<Specializations> getSpecializationsComputerLibrarian() {
        return specializationsComputerLibrarian;
    }

    public static void setSpecializationsComputerLibrarian(List<Specializations> specializationsComputerLibrarian) {
        Reader.specializationsComputerLibrarian = specializationsComputerLibrarian;
    }

    public static List<Specializations> getSpecializationsJapan() {
        return specializationsJapan;
    }

    public static void setSpecializationsJapan(List<Specializations> specializationsJapan) {
        Reader.specializationsJapan = specializationsJapan;
    }

    public static List<Specializations> getSpecializationsClassicalPhilology() {
        return specializationsClassicalPhilology;
    }

    public static void setSpecializationsClassicalPhilology(List<Specializations> specializationsClassicalPhilology) {
        Reader.specializationsClassicalPhilology = specializationsClassicalPhilology;
    }

    public static List<Specializations> getSpecializationsHungarian() {
        return specializationsHungarian;
    }

    public static void setSpecializationsHungarian(List<Specializations> specializationsHungarian) {
        Reader.specializationsHungarian = specializationsHungarian;
    }

    public static List<Specializations> getSpecializationsScandinavian() {
        return specializationsScandinavian;
    }

    public static void setSpecializationsScandinavian(List<Specializations> specializationsScandinavian) {
        Reader.specializationsScandinavian = specializationsScandinavian;
    }

    public static List<Specializations> getSpecializationsHistory() {
        return specializationsHistory;
    }

    public static void setSpecializationsHistory(List<Specializations> specializationsHistory) {
        Reader.specializationsHistory = specializationsHistory;
    }

    public static List<Specializations> getSpecializationsOther() {
        return specializationsOther;
    }

    public static void setSpecializationsOther(List<Specializations> specializationsOther) {
        Reader.specializationsOther = specializationsOther;
    }
}
