package ir.maktab.java32.homework8.article.domain;


import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private long nationalCode;
    private String birthday;
    private String password;

    public User(String username, long nationalCode, String dob) {
        this.username = username;
        this.nationalCode = nationalCode;
        this.birthday = dob;
    }
}
