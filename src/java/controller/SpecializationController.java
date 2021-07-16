package controller;

import courses.Specializations;
import utils.Reader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SpecializationController {

    public void printInfosOfLists(List<Specializations> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1) + ". szak megnevezéseneve: " + list.get(i).getNameOfCourses().HUN_NAME.toLowerCase() +
                    " tanegység kódja: " + list.get(i).getCodeOfCourses() +
                    " tanegység megnevezése: " + list.get(i).getNameOfUnit() +
                    " tanegység típusa: " + list.get(i).getUnitType().CODE +
                    " ajánlott félévek száma: " + list.get(i).getRecommendedSemester() +
                    " credit: " + list.get(i).getCredit() +
                    " előfeltétel kódja: " + list.get(i).getRequirement());
        }
    }

    public List<Specializations> coursedHasNoPreviousRequirement(List<Specializations> list) {
        List<Specializations> noPrevRequirement = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getRequirement().equals("NULL")) {
                noPrevRequirement.add(list.get(i));
            }
        }
        return noPrevRequirement;
    }

    public void printCourseHasNoPreviousRequirement(List<Specializations> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1) + ". " + list.get(i).getNameOfCourses().HUN_NAME.toLowerCase() + ": " + list.get(i).getCodeOfCourses());
        }
    }

    public HashMap<String, String> getListOfNoPreviousRequirement(List<Specializations> arrayList) {
        HashMap<String, String> noPrevRequirements = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++) {
            // TODO check the condition
            if ("NULL".equals(arrayList.get(i).getRequirement())) {
                noPrevRequirements.put(arrayList.get(i).getCodeOfCourses(), arrayList.get(i).getNameOfCourses().HUN_NAME.toLowerCase());
            }
        }
        return noPrevRequirements;
    }

    public void printListOfNoPreviousRequirement(HashMap<String, String> hashMap) {
        for (int i = 0; i < hashMap.size(); i++) {
            System.out.println(hashMap.get(i));
        }
    }

    public HashMap<String, String> makeHashMap(List<Specializations> arrayList) {
        HashMap<String, String> noPrevRequirements = new HashMap<>();
        for (Specializations specializations : arrayList) {
            {
                noPrevRequirements.put(specializations.getCodeOfCourses(), specializations.getNameOfCourses().HUN_NAME.toLowerCase());
            }
        }
        return noPrevRequirements;
    }
}
