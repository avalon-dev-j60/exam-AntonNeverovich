package server.models;

import javax.persistence.*;
import java.io.Serializable;

@NamedQueries(
        @NamedQuery(name = "wer",
                    query = "select user from Users user where user.credentials.email =: email")
)

@Entity(name = "Users")
public class User implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String surname;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private models.Credentials credentials;

    protected User() {
    }

    public User(String name, String surname, models.Credentials credentials) {
        this.name = name;
        this.surname = surname;
        this.credentials = credentials;
    }

    public User(String name, models.Credentials credentials) {
        this.name = name;
        this.credentials = credentials;
    }

    public User(models.Credentials credentials) {
        this.credentials = credentials;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public models.Credentials getCredentials() {
        return credentials;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
