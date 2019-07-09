package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profile implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String avatarPath;

    protected Profile() {
        avatarPath = "${pageContext.servletContext.contextPath}/images/userpic.jpg";
    }

    // getters
    public long getId() {
        return id;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    //setters
    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }
    
}
