package pl.pingwit.lec_28.point_2.entity;

public class PingwitStudent {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PingwitStudent{" +
            "name='" + name + '\'' +
            '}';
    }

}
