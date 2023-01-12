package crud.repository;

import crud.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {

    List<User> findAll();
    User findById(long id);
    void add(User user);
    void update(long id, User updatedUser);
    void delete(long id);
}
