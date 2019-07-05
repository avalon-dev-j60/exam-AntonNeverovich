package models;

import server.util.EncryptHelper;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Credentials implements Serializable {

    @Id
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;


    protected Credentials() {
    }

    public Credentials(String email, String password) {
        this.email = email;
        this.password = EncryptHelper.md5(password);
    }



    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Credentials(String password) {
        this.password = EncryptHelper.md5(password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password);
    }

    private boolean equals(Credentials credentials) {
        return credentials.email.equals(email) && credentials.password.equals(password);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj instanceof Credentials) {
            return equals((Credentials)obj);
        }

        return false;
    }
}
