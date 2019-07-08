package services;

import core.Crud;
import models.User;

public interface UserServiceLocal extends Crud<User> {
    User find(String email);
}
