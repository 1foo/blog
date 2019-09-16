package ink.ifoo.blog.controller;

import ink.ifoo.blog.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: blog
 * @description:
 * @author: FuYu
 * @create: 2019-09-15 15:22
 **/
@Controller
public class indexController {
    @Autowired
    ArticleMapper articleMapper;

    @GetMapping("/")
    public  String  index(){


        return "index";
    }

}



