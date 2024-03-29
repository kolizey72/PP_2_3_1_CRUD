package crud.service;

import crud.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findById(long id);
    void add(User user);
    void update(long id, User updatedUser);
    void delete(long id);
}
