package ink.ifoo.blog.controller;

import ink.ifoo.blog.mapper.ArticleMapper;
import ink.ifoo.blog.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: blog
 * @description:
 * @author: FuYu
 * @create: 2019-09-14 23:01
 **/
@Controller
public class writeController {

    @Autowired
    ArticleMapper articleMapper;

    @GetMapping("/write")
    public String write() {

        return "write";
    }

    @PostMapping("/write")
    public String publish(@RequestParam("title")String title,
                          @RequestParam("body") String body,
                          @RequestParam("tag")String tag){
        Article article = new Article();
        article.setTitle(title);
        article.setBody(body);
        article.setTag(tag);
        article.setGmtCreate(System.currentTimeMillis());

        articleMapper.insert(article);

        return "write";
    }


}


