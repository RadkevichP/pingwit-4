package pl.pingwit.lec_28.point_1.entity;

public class ProgrammingLanguage {
    private String language;
    private int experienceAge;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getExperienceAge() {
        return experienceAge;
    }

    public void setExperienceAge(int experienceAge) {
        this.experienceAge = experienceAge;
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage{" +
                "language='" + language + '\'' +
                ", experienceAge=" + experienceAge +
                '}';
    }
}
