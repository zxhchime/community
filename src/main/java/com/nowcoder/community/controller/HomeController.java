package com.nowcoder.community.controller;

import com.nowcoder.community.dao.DiscussPostDao;
import com.nowcoder.community.dao.UserDao;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.Page;
import com.nowcoder.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class HomeController {

    @Autowired
    DiscussPostDao discussPostDao;

    @Autowired
    UserDao userDao;

    @GetMapping("/index")
    public String toIndex(Model model, Page page){
        int rows = discussPostDao.selectDiscussPostRows(0);
        page.setRows(rows);
        page.setPath("/index");
        List<DiscussPost> list = discussPostDao.selectDiscussPosts(0, page.getOffset(), page.getLimit());
        List<Map<String, Object>> discussPosts = list.stream().map((discussPost) -> {
            Map<String, Object> map = new HashMap<>();
            map.put("post", discussPost);
            User user = userDao.selectById(discussPost.getUserId());
            map.put("user", user);
            return map;
        }).collect(Collectors.toList());
        model.addAttribute("discussPosts",discussPosts);
        return "index";
    }
}
