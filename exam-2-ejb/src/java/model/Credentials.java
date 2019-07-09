package model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import utils.EncryptHelper;

@Entity
public class Credentials implements Serializable {
    private static final long serialVersionUID = 1L;
    
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = EncryptHelper.md5(password);
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
