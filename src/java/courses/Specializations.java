package courses;

import model.NameOfCourses;
import model.UnitType;

import java.util.List;

public class Specializations extends Courses {

    String nameOfUnit;
    UnitType unitType;
    List<Integer> recommendedSemester;
    int credit;
    List<String> requirement;

    public Specializations() {
    }

    public Specializations(NameOfCourses nameOfCourses, String codeOfCourses, String nameOfUnit, UnitType unitType,
                           List<Integer> recommendedSemester, int credit, List<String> requirement) {
        super(nameOfCourses, codeOfCourses);
        this.nameOfUnit = nameOfUnit;
        this.unitType = unitType;
        this.recommendedSemester = recommendedSemester;
        this.credit = credit;
        this.requirement = requirement;
    }

    public String getNameOfUnit() {
        return nameOfUnit;
    }

    public void setNameOfUnit(String nameOfUnit) {
        this.nameOfUnit = nameOfUnit;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public void setUnitType(UnitType unitType) {
        this.unitType = unitType;
    }

    public List<Integer> getRecommendedSemester() {
        return recommendedSemester;
    }

    public void setRecommendedSemester(List<Integer> recommendedSemester) {
        this.recommendedSemester = recommendedSemester;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public List<String> getRequirement() {
        return requirement;
    }

    public void setRequirement(List<String> requirement) {
        this.requirement = requirement;
    }
}
