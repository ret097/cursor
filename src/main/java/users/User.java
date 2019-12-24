package main.java.users;

import java.time.LocalDate;

public class User {
    private String mail;
    private LocalDate loginDate;
    private String team;

    public User(String mail, LocalDate loginDate, String team) {
        this.mail = mail;
        this.loginDate = loginDate;
        this.team = team;
    }

    public String getMail() {
        return mail;
    }

    public LocalDate getLoginDate() {
        return loginDate;
    }

    public String getTeam() {
        return team;
    }
}
