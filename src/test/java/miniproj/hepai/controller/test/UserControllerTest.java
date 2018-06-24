package miniproj.hepai.controller.test;

import miniproj.hepai.beans.User;
import miniproj.hepai.controller.UserController;
import org.junit.Test;

public class UserControllerTest {

    @Test
    public void testPostUser() {
        UserController controller = new UserController();
        User user = new User("大侠", "28.jpg", "v", "3455", "44566");
        controller.postUser(user);
    }

    @Test
    public void testgetUser() {
        UserController controller = new UserController();
        User user = new User();
        user.setQq("q");
        user.setPassword("p");
        user = controller.getUser(user);
        System.out.println(user.getName());
    }
}
