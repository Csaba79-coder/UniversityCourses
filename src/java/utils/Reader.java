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

    public List<Specializations> allSpecialization;
    private List<Specializations> specializationsEnglish = new ArrayList<>();
    private List<Specializations> specializationsGerman = new ArrayList<>();
    private List<Specializations> specializationsComputerLibrarian = new ArrayList<>();
    private List<Specializations> specializationsJapan = new ArrayList<>();
    private List<Specializations> specializationsClassicalPhilology = new ArrayList<>();
    private List<Specializations> specializationsHungarian = new ArrayList<>();
    private List<Specializations> specializationsScandinavian = new ArrayList<>();
    private List<Specializations> specializationsHistory = new ArrayList<>();
    private List<Specializations> specializationsOther = new ArrayList<>();

    
    public Reader() {
        try {
            Buffer(FileHandler.SOURCE_TEXT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        allSpecialization = fillUpAllSpecList();
    }

    public void Buffer(String fileName) throws IOException {
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

    private List<Integer> semesterList(String string){
        List<Integer> myList = new ArrayList<>();
        String[] parts = string.split("\\|");
        for (int i = 0; i < parts.length; i++) {
            myList.add(Integer.parseInt(parts[i]));
        }
        return myList;
    }

    private List<String> createArrayOfPreStudies(String string) {
        String[] parts = string.split("\\|");
        return new ArrayList<>(Arrays.asList(parts));
    }

    public List<Specializations> getSpecializationsEnglish() {
        return specializationsEnglish;
    }

    public List<Specializations> getAllSpecialization() {
        return allSpecialization;
    }

    public void setAllSpecialization(List<Specializations> allSpecialization) {
        this.allSpecialization = allSpecialization;
    }

    public void setSpecializationsEnglish(List<Specializations> specializationsEnglish) {
        this.specializationsEnglish = specializationsEnglish;
    }

    public List<Specializations> getSpecializationsGerman() {
        return specializationsGerman;
    }

    public void setSpecializationsGerman(List<Specializations> specializationsGerman) {
        this.specializationsGerman = specializationsGerman;
    }

    public List<Specializations> getSpecializationsComputerLibrarian() {
        return specializationsComputerLibrarian;
    }

    public void setSpecializationsComputerLibrarian(List<Specializations> specializationsComputerLibrarian) {
        this.specializationsComputerLibrarian = specializationsComputerLibrarian;
    }

    public List<Specializations> getSpecializationsJapan() {
        return specializationsJapan;
    }

    public void setSpecializationsJapan(List<Specializations> specializationsJapan) {
        this.specializationsJapan = specializationsJapan;
    }

    public List<Specializations> getSpecializationsClassicalPhilology() {
        return specializationsClassicalPhilology;
    }

    public void setSpecializationsClassicalPhilology(List<Specializations> specializationsClassicalPhilology) {
        this.specializationsClassicalPhilology = specializationsClassicalPhilology;
    }

    public List<Specializations> getSpecializationsHungarian() {
        return specializationsHungarian;
    }

    public void setSpecializationsHungarian(List<Specializations> specializationsHungarian) {
        this.specializationsHungarian = specializationsHungarian;
    }

    public List<Specializations> getSpecializationsScandinavian() {
        return specializationsScandinavian;
    }

    public void setSpecializationsScandinavian(List<Specializations> specializationsScandinavian) {
        this.specializationsScandinavian = specializationsScandinavian;
    }

    public List<Specializations> getSpecializationsHistory() {
        return specializationsHistory;
    }

    public void setSpecializationsHistory(List<Specializations> specializationsHistory) {
        this.specializationsHistory = specializationsHistory;
    }

    public List<Specializations> getSpecializationsOther() {
        return specializationsOther;
    }

    public void setSpecializationsOther(List<Specializations> specializationsOther) {
        this.specializationsOther = specializationsOther;
    }
    
    public List<Specializations> fillUpAllSpecList() {
        List<Specializations> tempList = new ArrayList<>();
        tempList.addAll(specializationsEnglish);
        tempList.addAll(specializationsGerman != null ? specializationsGerman : null);
        tempList.addAll(specializationsComputerLibrarian);
        tempList.addAll(specializationsJapan);
        tempList.addAll(specializationsClassicalPhilology);
        tempList.addAll(specializationsHungarian);
        tempList.addAll(specializationsScandinavian);
        tempList.addAll(specializationsHistory);
        return tempList;
    }
}
