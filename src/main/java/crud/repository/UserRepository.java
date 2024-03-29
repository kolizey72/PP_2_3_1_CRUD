package crud.repository;

import crud.model.User;

import java.util.List;

public interface UserRepository {

    List<User> findAll();
    User findById(long id);
    void add(User user);
    void update(long id, User updatedUser);
    void delete(long id);
}
