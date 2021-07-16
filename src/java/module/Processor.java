package module;

import controller.SpecializationController;
import courses.Courses;
import courses.Specializations;
import model.UnitType;
import utils.FileHandler;
import utils.Reader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Processor {


    public static void run() {

        Reader reader = new Reader();

        System.out.println("-------------------1-------------------");
        System.out.println("List by study courses: \n");


        SpecializationController specializationController = new SpecializationController();
        specializationController.printInfosOfLists(reader.getSpecializationsEnglish());
        specializationController.printInfosOfLists(reader.getSpecializationsGerman());
        specializationController.printInfosOfLists(reader.getSpecializationsComputerLibrarian());
        specializationController.printInfosOfLists(reader.getSpecializationsJapan());
        specializationController.printInfosOfLists(reader.getSpecializationsClassicalPhilology());
        specializationController.printInfosOfLists(reader.getSpecializationsHungarian());
        specializationController.printInfosOfLists(reader.getSpecializationsScandinavian());
        specializationController.printInfosOfLists(reader.getSpecializationsHistory());
        // specializationController.printInfosOfLists(otherStuds);


        System.out.println("\n-------------------2-------------------");
        System.out.println("List of studies that has no previous requirements: \n");

        specializationController.printCourseHasNoPreviousRequirement(specializationController.coursedHasNoPreviousRequirement(reader.getSpecializationsEnglish()));
        specializationController.printCourseHasNoPreviousRequirement(specializationController.coursedHasNoPreviousRequirement(reader.getSpecializationsGerman()));
        specializationController.printCourseHasNoPreviousRequirement(specializationController.coursedHasNoPreviousRequirement(reader.getSpecializationsComputerLibrarian()));
        specializationController.printCourseHasNoPreviousRequirement(specializationController.coursedHasNoPreviousRequirement(reader.getSpecializationsJapan()));
        specializationController.printCourseHasNoPreviousRequirement(specializationController.coursedHasNoPreviousRequirement(reader.getSpecializationsClassicalPhilology()));
        specializationController.printCourseHasNoPreviousRequirement(specializationController.coursedHasNoPreviousRequirement(reader.getSpecializationsHungarian()));
        specializationController.printCourseHasNoPreviousRequirement(specializationController.coursedHasNoPreviousRequirement(reader.getSpecializationsScandinavian()));
        specializationController.printCourseHasNoPreviousRequirement(specializationController.coursedHasNoPreviousRequirement(reader.getSpecializationsHistory()));

        // specializationController.printListOfNoPreviousRequirement(specializationController.getListOfNoPreviousRequirement(reader.getSpecializationsEnglish()));

        // System.out.println(specializationController.coursedHasNoPreviousRequirement(reader.getSpecializationsEnglish()));
        // System.out.println(specializationController.getListOfNoPreviousRequirement(reader.getSpecializationsEnglish()));

        // System.out.println(specializationController.makeHashMap(reader.getSpecializationsEnglish()));

        System.out.println("-------------------3-------------------");
        System.out.println("List by study unit and those types: \n");

        specializationController.printCourseHasNoPreviousRequirement(specializationController.getUnitListAndType(reader.getSpecializationsEnglish(), UnitType.PRACTICE));

        System.out.println("-------------------4-------------------");
        System.out.println("List by the most pre-studies requirement: \n");

        specializationController.getMostPrevStudRequirement(reader.getAllSpecialization());

        System.out.println("-------------------5-------------------");
        System.out.println("List of pre-studies requirement: \n");

        specializationController.printSet(specializationController.getTheLongestPreconditionMajorChain(reader.getAllSpecialization()));
        specializationController.printSet(specializationController.getTheLongestPreconditionMajorChain(reader.getAllSpecialization()));
    }
}
