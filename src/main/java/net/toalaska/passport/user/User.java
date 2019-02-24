package net.toalaska.passport.user;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



import javax.persistence.*;




@Entity
@Table(name="net_passport_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User   {



    @Id
    @GeneratedValue
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
