package mk.ukim.finki.wp.ebookshop.repository;

import mk.ukim.finki.wp.ebookshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Override
    List<User> findAll();

    Optional<Object> findByUsername(String username);

    User findByUsernameAndPassword(String username, String password);

    Optional<Object> findByPassword(String password);


}
