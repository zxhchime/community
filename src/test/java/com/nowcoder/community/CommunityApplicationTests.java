package com.nowcoder.community;

import com.nowcoder.community.dao.DiscussPostDao;
import com.nowcoder.community.dao.UserDao;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.User;
import lombok.extern.log4j.Log4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest

class CommunityApplicationTests {

    @Autowired
    DiscussPostDao discussPostDao;

    @Autowired
    UserDao userDao;

    Logger logger= LoggerFactory.getLogger(CommunityApplicationTests.class);

    @Test
    void testLog(){
        logger.info("info");
        logger.debug("debug");
        logger.warn("warn");
        logger.error("error");
        logger.trace("trace");

    }

    @Test
    void testUser(){
        User user = userDao.selectById(1);
        System.out.println(user);
    }

    @Test
    void contextLoads() {
        int count = discussPostDao.selectDiscussPostRows(0);
        System.out.println(count);

        List<DiscussPost> discussPosts = discussPostDao.selectDiscussPosts(0, 1, 5);
        System.out.println(discussPosts);
    }

}
