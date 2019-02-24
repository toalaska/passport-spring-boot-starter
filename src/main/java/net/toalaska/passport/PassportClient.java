package net.toalaska.passport;

import net.toalaska.passport.repository.UserRepository;
import net.toalaska.passport.user.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class PassportClient {
    @Autowired
    UserRepository userRepository;

    public boolean check(String userId ,String userToken){
        User user = userRepository.findByUserIdAndUserToken(userId);


        return user!=null;
    }

    public void loginByUserName(String userName,String password){

    }
    public void login(String userName,String password){

    }
    public void logout(String userName,String password){

    }
    public Map<String,String> list(){
        return new HashMap<String, String>();
    }
}
