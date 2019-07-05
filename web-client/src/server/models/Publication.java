package server.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@NamedQueries(
        @NamedQuery(    name = "find-publication-by-id",
                        query = "select item from Publication as item where item.id =: id")
)
@Entity
public class Publication implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "long varchar")
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date createdAt;

    @ManyToOne
    @JoinColumn(nullable = false)
    private User author;

    protected Publication() {}

    public Publication(User author, String title, String content) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.createdAt = new Date();
    }

    // getters
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public User getAuthor() {
        return author;
    }

    //setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
