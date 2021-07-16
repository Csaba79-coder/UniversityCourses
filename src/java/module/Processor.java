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



        specializationController.printCourseHasNoPreviousRequirement(specializationController.coursedHasNoPreviousRequirement(englishList));
        specializationController.printListOfNoPreviousRequirement(specializationController.getListOfNoPreviousRequirement(englishList));

        System.out.println(specializationController.coursedHasNoPreviousRequirement(englishList));
        System.out.println(specializationController.getListOfNoPreviousRequirement(englishList));

        System.out.println(specializationController.makeHashMap(englishList));
    }
}
