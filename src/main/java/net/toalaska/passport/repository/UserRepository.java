package net.toalaska.passport.repository;

import net.toalaska.passport.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByUserId(String userId);

    User findByUserIdAndUserToken(String userId);

}

