package net.toalaska.passport.user;



import org.springframework.data.annotation.Id;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;

/**
 * Created by fan.jin on 2016-10-15.
 */

@Entity
@Table(name="net_passport_user")
public class User   {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "user_id")
    private String userId;

   @Column(name = "user_token")
    private String userToken;

}
