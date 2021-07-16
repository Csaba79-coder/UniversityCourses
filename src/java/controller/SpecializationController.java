package controller;

import courses.Specializations;
import model.UnitType;


import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SpecializationController {

    public void printInfosOfLists(List<Specializations> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". szak megnevezéseneve: " + list.get(i).getNameOfCourses().HUN_NAME.toLowerCase() +
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
            if (list.get(i).getRequirement().contains("NULL")) {
                noPrevRequirement.add(list.get(i));
            }
        }
        return noPrevRequirement;
    }

    public void printCourseHasNoPreviousRequirement(List<Specializations> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i).getNameOfCourses().HUN_NAME.toLowerCase() + ": " + list.get(i).getCodeOfCourses());
        }
    }

    /*public HashMap<String, String> getListOfNoPreviousRequirement(List<Specializations> arrayList) {
        HashMap<String, String> noPrevRequirements = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++) {
            // TODO check the condition
            if (arrayList.get(i).getRequirement().contains("NULL")) {
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
    }*/


    public List<Specializations> getUnitListAndType(List<Specializations> arrayList, UnitType unitType) {
        List<Specializations> listOfUnitsAndTypes = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getUnitType().CODE.equals(unitType.CODE)) {
                listOfUnitsAndTypes.add(arrayList.get(i));
            }
        }
        return listOfUnitsAndTypes;
    }

    public Specializations getMostPrevStudRequirement(List<Specializations> arrayList) {
        Specializations firstMostPrecondition = new Specializations();
        int counter = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getRequirement().size() > counter) {
                counter = arrayList.get(i).getRequirement().size();
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getRequirement().size() == counter) {
                firstMostPrecondition = arrayList.get(i);
                System.out.println(arrayList.get(i).getNameOfCourses().HUN_NAME.toLowerCase() + ": " + arrayList.get(i).getCodeOfCourses());
                break;
            }
        }
        return firstMostPrecondition;
    }


    private void chain(Specializations specializations, Set<Specializations> theLongestPreconditionMajorChain, List<Specializations> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getRequirement().contains(specializations.getCodeOfCourses())) {
                theLongestPreconditionMajorChain.add(specializations);
                theLongestPreconditionMajorChain.add(arrayList.get(i));
                specializations = arrayList.get(i);
            }
        }
    }


    public Set<Specializations> getTheLongestPreconditionMajorChain(List<Specializations> arrayList) {
        Set<Specializations> theLongestPreconditionMajorChain = new HashSet<>();
        List<Set<Specializations>> majorSets = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            Set<Specializations> chainSet = new HashSet<>();
            chain(arrayList.get(i), chainSet, arrayList);
            majorSets.add(chainSet);
        }
        for (int i = 0; i < majorSets.size(); i++) {
            if (majorSets.get(i).size() > theLongestPreconditionMajorChain.size())
                theLongestPreconditionMajorChain = majorSets.get(i);
        }
        return theLongestPreconditionMajorChain;
    }

    public void printSet(Set<Specializations> hashSet) {
        for (Specializations specializations : hashSet) {
            System.out.println(specializations.getNameOfCourses().HUN_NAME.toLowerCase() + ": " + specializations.getCodeOfCourses());
        }
    }
}
