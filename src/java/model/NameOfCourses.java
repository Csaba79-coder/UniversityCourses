package model;

public enum NameOfCourses {

    ENGLISH_STUDIES("ANGLISZTIKA"),
    GERMAN_STUDIES("GERMANISZTIKA"),
    COMPUTER_LIBRARIAN("INFORMATIKUS KÖNYVTÁROS"),
    JAPAN_STUDIES("JAPÁN"),
    CLASSICAL_PHILOLOGY("KLASSZIKUS FILOLÓGIA"),
    HUNGARIAN_STUDIES("MAGYAR"),
    SCANDINAVIAN_STUDIES("SKANDINAVISZTIKA"),
    HISTORY("TÖRTÉNELEM"),
    OTHER("EGYÉB");


    public final String HUN_NAME;

    NameOfCourses(String HUN_NAME) {
        this.HUN_NAME = HUN_NAME;
    }

    public static NameOfCourses getEnumNameOfCourses(String string) {
        for (int i = 0; i < values().length; i++) {
            if (string.equals(values()[i].HUN_NAME.toLowerCase())) {
                return values()[i];

            }
        }
        return NameOfCourses.OTHER;
    }
}
