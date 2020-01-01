package ir.maktab.java32.homework8.article.domain;


import lombok.Data;
import lombok.ToString;
import net.bytebuddy.build.Plugin;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private long nationalCode;
    private String birthday;
    private String password;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "authors")
    @ToString.Exclude
    private List<Article> articles = new ArrayList<>();

    public Author(String username, long nationalCode, String dob) {
        this.username = username;
        this.nationalCode = nationalCode;
        this.password = String.valueOf(nationalCode);
        this.birthday = dob;
    }
}
