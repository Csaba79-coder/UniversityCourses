package module;

import controller.SpecializationController;
import courses.Courses;
import courses.Specializations;
import utils.FileHandler;
import utils.Reader;

import java.util.Arrays;
import java.util.List;

public class Processor {

    public static void run() {

        FileHandler fileHandler = new FileHandler();
        fileHandler.readFile("szakok.txt");

        System.out.println("-------------------1-------------------");
        System.out.println("List by study courses: \n");

        List<Specializations> englishList = Reader.getSpecializationsEnglish();
        List<Specializations> germanList = Reader.getSpecializationsGerman();
        List<Specializations> informaticsList = Reader.getSpecializationsComputerLibrarian();
        List<Specializations> japanList = Reader.getSpecializationsJapan();
        List<Specializations> classicalFiloList = Reader.getSpecializationsClassicalPhilology();
        List<Specializations> hungarianList = Reader.getSpecializationsHungarian();
        List<Specializations> scandinavianList = Reader.getSpecializationsScandinavian();
        List<Specializations> historyList = Reader.getSpecializationsHistory();
        // List<Specializations> otherStuds = Reader.getSpecializationsOther();

        SpecializationController specializationController = new SpecializationController();
        specializationController.printInfosOfLists(englishList);
        specializationController.printInfosOfLists(germanList);
        specializationController.printInfosOfLists(informaticsList);
        specializationController.printInfosOfLists(japanList);
        specializationController.printInfosOfLists(classicalFiloList);
        specializationController.printInfosOfLists(hungarianList);
        specializationController.printInfosOfLists(scandinavianList);
        specializationController.printInfosOfLists(historyList);
        // specializationController.printInfosOfLists(otherStuds);


        System.out.println("\n-------------------2-------------------");
        System.out.println("List of studies that has no previous requirements: \n");

        specializationController.printCourseHasNoPreviousRequirement(specializationController.coursedHasNoPreviousRequirement(englishList));
        specializationController.printCourseHasNoPreviousRequirement(specializationController.coursedHasNoPreviousRequirement(germanList));
        specializationController.printCourseHasNoPreviousRequirement(specializationController.coursedHasNoPreviousRequirement(informaticsList));
        specializationController.printCourseHasNoPreviousRequirement(specializationController.coursedHasNoPreviousRequirement(japanList));
        specializationController.printCourseHasNoPreviousRequirement(specializationController.coursedHasNoPreviousRequirement(classicalFiloList));
        specializationController.printCourseHasNoPreviousRequirement(specializationController.coursedHasNoPreviousRequirement(hungarianList));
        specializationController.printCourseHasNoPreviousRequirement(specializationController.coursedHasNoPreviousRequirement(scandinavianList));
        specializationController.printCourseHasNoPreviousRequirement(specializationController.coursedHasNoPreviousRequirement(historyList));

        // specializationController.printListOfNoPreviousRequirement(specializationController.getListOfNoPreviousRequirement(englishList));

        // System.out.println(specializationController.coursedHasNoPreviousRequirement(englishList));
        // System.out.println(specializationController.getListOfNoPreviousRequirement(englishList));

        // System.out.println(specializationController.makeHashMap(englishList));
    }
}
