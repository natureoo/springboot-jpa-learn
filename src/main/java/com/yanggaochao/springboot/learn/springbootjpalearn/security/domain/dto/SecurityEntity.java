package com.yanggaochao.springboot.learn.springbootjpalearn.security.domain.dto;


import com.yanggaochao.springboot.learn.springbootjpalearn.security.domain.dao.UserDO;


public class SecurityEntity {
    private String token;
    private Long exipre;
    private UserDO user;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getExipre() {
        return exipre;
    }

    public void setExipre(Long exipre) {
        this.exipre = exipre;
    }

    public UserDO getUser() {
        return user;
    }

    public void setUser(UserDO user) {
        this.user = user;
    }
}
