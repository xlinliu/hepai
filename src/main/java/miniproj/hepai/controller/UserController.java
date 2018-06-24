package miniproj.hepai.controller;

import miniproj.hepai.beans.User;
import miniproj.hepai.dao.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping(value = "getuser",method = RequestMethod.POST)
    @ResponseBody
    public User getUser(@RequestBody User user){
        return UserDao.get(user.getId());
    }

    @RequestMapping(value = "postuser",method = RequestMethod.POST)
    @ResponseBody
    public User postUser(@RequestBody User user){
        return UserDao.save(user);
    }
}
