package ink.ifoo.blog.controller;

import ink.ifoo.blog.mapper.ArticleMapper;
import ink.ifoo.blog.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

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
    public  String  index(Model model){

        List<Article> articles = articleMapper.selectAll();


        model.addAttribute("articles" ,articles);

        return "index";
    }

}



