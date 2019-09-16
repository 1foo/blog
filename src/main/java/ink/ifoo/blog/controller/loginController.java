package ink.ifoo.blog.controller;

import ink.ifoo.blog.mapper.UserMapper;
import ink.ifoo.blog.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: blog
 * @description:
 * @author: FuYu
 * @create: 2019-09-16 16:24
 **/


@Controller
public class loginController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/login")
    public String initlogin() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password) {

        User user = new User();
        user.setName(username);
        user.setToken(password);
        User userResource = userMapper.selectByPrimaryKey(1);
        if (userResource != null) {


            if (userResource.getName().equals(user.getName()) && userResource.getToken().equals(user.getToken()))
                return "write";
        }


        return "index";


    }
}

