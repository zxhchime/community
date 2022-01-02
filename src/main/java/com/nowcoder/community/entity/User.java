package com.nowcoder.community.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * idint(11) NOT NULL
 * usernamevarchar(50) NULL
 * passwordvarchar(50) NULL
 * saltvarchar(50) NULL
 * emailvarchar(100) NULL
 * typeint(11) NULL0-普通用户；1-超级管理员；2-版主；
 * statusint(11) NULL0-未激活；1-已激活；
 * activation_codevarchar(100) NULL
 * header_urlvarchar(200) NULL
 * create_timetimestamp NULL
 */
//用户
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private int id;
    private String username;
    private String password;
    private String salt;//盐
    private String email;
    private int type;
    private int status;
    private String activationCode;
    private String headerUrl;
    private Date createTime;
}
