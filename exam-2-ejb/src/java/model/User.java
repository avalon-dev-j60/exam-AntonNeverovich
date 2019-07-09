package model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String surname;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private Credentials credentials;
    
    protected User() {}

    public User(String name, String surname, Credentials credentials) {
        this.name = name;
        this.surname = surname;
        this.credentials = credentials;
    }

    public User(String name, Credentials credentials) {
        this.name = name;
        this.credentials = credentials;
    }

    public User(Credentials credentials) {
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

    public Credentials getCredentials() {
        return credentials;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
