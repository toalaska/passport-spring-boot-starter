package net.toalaska.passport;

import net.toalaska.passport.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByUserId(String userId);

    User findByUserIdAndUserToken(String userId,String userToken);

}

