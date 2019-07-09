package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.User;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-07-09T16:04:01")
@StaticMetamodel(Publication.class)
public class Publication_ { 

    public static volatile SingularAttribute<Publication, Date> createdAt;
    public static volatile SingularAttribute<Publication, User> author;
    public static volatile SingularAttribute<Publication, Long> id;
    public static volatile SingularAttribute<Publication, String> title;
    public static volatile SingularAttribute<Publication, String> content;

}