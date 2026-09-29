package jobsheet_w04;

public class Doctor {
    private final String name;
    private final String code;
    private final String specialization;

    public Doctor(String code, String name, String specialization) {
        this.code = code;
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getSpecialization() {
        return specialization;
    }
}
