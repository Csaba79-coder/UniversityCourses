package model;

public enum UnitType {

    KOLLOKVIUM("K"),
    GYAKORLAT("G"),
    VIZSGA("V"),
    EGYENI_FELKESZULES("EF"),
    DEFAULT("N/A");

    public final String CODE;

    UnitType(String code) {
        this.CODE = code;
    }

    public static UnitType getEnumUnitType(String string) {
        for (int i = 0; i < values().length; i++) {
            if (string.equals(values()[i].CODE)) {
                return values()[i];

            }
        }
        return UnitType.DEFAULT;
    }
}
