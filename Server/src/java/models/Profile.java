package models;

import java.util.List;
import javax.persistence.*;

@Entity
public class Profile {

    @Id
    @GeneratedValue
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
