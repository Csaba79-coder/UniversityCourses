package courses;

import model.NameOfCourses;

public class Courses {

    NameOfCourses nameOfCourses;
    String codeOfCourses;

    public Courses() {
    }

    public Courses(NameOfCourses nameOfCourses, String codeOfCourses) {
        this.nameOfCourses = nameOfCourses;
        this.codeOfCourses = codeOfCourses;
    }

    public NameOfCourses getNameOfCourses() {
        return nameOfCourses;
    }

    public NameOfCourses setNameOfCourses(NameOfCourses nameOfCourses) {
        this.nameOfCourses = nameOfCourses;
        return nameOfCourses;
    }

    public String getCodeOfCourses() {
        return codeOfCourses;
    }

    public void setCodeOfCourses(String codeOfCourses) {
        this.codeOfCourses = codeOfCourses;
    }
}