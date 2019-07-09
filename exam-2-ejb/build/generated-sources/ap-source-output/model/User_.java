package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Credentials;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-07-09T16:04:01")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Credentials> credentials;
    public static volatile SingularAttribute<User, String> surname;
    public static volatile SingularAttribute<User, String> name;
    public static volatile SingularAttribute<User, Long> id;

}