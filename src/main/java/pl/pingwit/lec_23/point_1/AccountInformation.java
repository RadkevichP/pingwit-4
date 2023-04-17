package pl.pingwit.lec_23.point_1;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Pavel Radkevich
 * @since 17.04.23
 */
public class AccountInformation {

    @JsonIgnore
    private String name;
    @LettersOnly
    private String surname;
    @Email
    private String email;

    public AccountInformation() {
    }

    public AccountInformation(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
