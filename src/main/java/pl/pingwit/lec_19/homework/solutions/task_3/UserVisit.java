package pl.pingwit.lec_19.homework.solutions.task_3;

import java.util.Objects;

/**
 * @author Pavel Radkevich
 * @since 1.04.23
 */
public class UserVisit {

    private final String userName;
    private final String siteName;

    public UserVisit(String userName, String siteName) {
        this.userName = userName;
        this.siteName = siteName;
    }

    public String getUserName() {
        return userName;
    }

    public String getSiteName() {
        return siteName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserVisit userVisit = (UserVisit) o;
        return Objects.equals(userName, userVisit.userName) && Objects.equals(siteName, userVisit.siteName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, siteName);
    }

    @Override
    public String toString() {
        return "UserVisit{" +
                "userName='" + userName + '\'' +
                ", siteName='" + siteName + '\'' +
                '}';
    }
}
