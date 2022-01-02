package com.nowcoder.community.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * idint(11) NOT NULL
 * user_idvarchar(45) NULL
 * titlevarchar(100) NULL
 * contenttext NULL
 * typeint(11) NULL0-普通；1-置顶；
 * statusint(11) NULL
 * create_timetimestamp NULL0-正常；1-精华；2-拉黑；
 * comment_countint(11) NULL
 * scoredouble NULL
 */

//帖子
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DiscussPost {
    private int id;
    private int userId;
    private String title;
    private String content;
    private int type;
    private int status;
    private Date createTime;
    private int commentCount;
    private double score;
}
