package net.toalaska.passport;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApplication.class)
public class MyTest {

    @Autowired
    private PassportClient passportClient;

    @Test
    public void testHelloWorld() {
        User user=null;
        try {
            user= passportClient.reg("sgzh", "123456");
        } catch (UserExistsException e) {
            e.printStackTrace();
        }
        assert user.getUsername().equals("sgzh");
        assert user.getPassword().equals("123456");

        for (User user1 : passportClient.list()) {
            System.out.printf(">>>>>>>>>>>>>>>> item: %s\n",user1.toString());
        }
    }


}