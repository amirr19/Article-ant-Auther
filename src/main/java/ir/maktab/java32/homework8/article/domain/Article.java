package ir.maktab.java32.homework8.article.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
private String title;
private String brief;
private String content;
private Date createDate;
private Date lastUpdateDate;
private Date publishedDate;
private boolean isPublished;
}
