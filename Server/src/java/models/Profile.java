package models;

import java.util.List;
import javax.persistence.*;

@Entity
public class Profile {

    @Id
    @GeneratedValue
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private User user;

    @OneToMany( mappedBy = "author",
            targetEntity = Publication.class,
            cascade = {CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.REFRESH,
                    CascadeType.PERSIST})
    private List<Publication> publications;

    private String avatarPath;

    protected Profile() {}

    public Profile(User user) {
        this.user = user;
        this.avatarPath = "WEB-INF/images/avatar.jpg";
    }

    // getters
    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public List<Publication> getPublications() {
        return publications;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    //setters

    public void setUser(User user) {
        this.user = user;
    }

    public void setPublications(List<Publication> publications) {
        this.publications = publications;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }
}
