package ink.ifoo.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: blog
 * @description:
 * @author: FuYu
 * @create: 2019-09-14 23:01
 **/
@Controller
public class writeController {
    @GetMapping("/write")
    public String write(){

        return "write";
    }


}


