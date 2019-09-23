package ink.ifoo.blog.controller;

import ink.ifoo.blog.mapper.ArticleMapper;
import ink.ifoo.blog.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: blog
 * @description:
 * @author: FuYu
 * @create: 2019-09-23 15:16
 **/

@Controller
public class articleController {
    @Autowired
    ArticleMapper articleMapper;

    @GetMapping("article")

    public String getArticle(@RequestParam("id") String id,
                             Model model){

        Article article = articleMapper.selectByPrimaryKey(Integer.valueOf(id));
        model.addAttribute("article",article);

        return "article";
    }
}
