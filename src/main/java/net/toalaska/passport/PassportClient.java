package net.toalaska.passport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class PassportClient {
    @Autowired
    UserRepository userRepository;


    public boolean exists(String userName ){
        return userRepository.findByUsername(userName)!=null;
    }
    public User reg(String userName, String password) throws UserExistsException {
        if(exists(userName)){
            throw new UserExistsException();
        }
        User user=new User();
        String userId = UUID.randomUUID().toString();
        String userToken = UUID.randomUUID().toString();
        user.setUserId(userId);
        user.setUserToken(userToken);
        user.setUsername(userName);
        user.setPassword(password);
        userRepository.save(user);
        return user;

    }
    public User login(String userName, String password) throws UserNotExistsException {
        User user = userRepository.findByUsername(userName);
        if (user==null){
            throw new UserNotExistsException();
        }
        return user;

    }
    public boolean check(String userId ,String userToken){
        User user = userRepository.findByUserIdAndUserToken(userId,userToken);


        return user!=null;
    }

    public void logout(String userId,String userToken){
        User user = userRepository.findByUserIdAndUserToken(userId,userToken);
        if(user!=null){
            userRepository.delete(user);
        }

    }

    //admin
    public User get(String userId){

        return userRepository.findByUserId(userId);
    }
    public User getByUserName(String userName){
        return userRepository.findByUsername(userName);
    }
    public List<User> list(){

        return   userRepository.findAll();
    }
}
