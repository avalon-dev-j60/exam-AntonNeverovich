package server.services;

import server.core.Crud;
import server.models.User;

import javax.ejb.Local;

@Local
public interface UserServiceLocal extends Crud<User> {

    User find(String email);
}
