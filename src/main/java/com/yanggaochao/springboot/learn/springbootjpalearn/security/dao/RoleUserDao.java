package com.yanggaochao.springboot.learn.springbootjpalearn.security.dao;


import com.yanggaochao.springboot.learn.springbootjpalearn.security.domain.dao.RoleUserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleUserDao extends JpaRepository<RoleUserDO, Long> {
    void deleteByRoleId(Long roleId);

    void deleteByUserId(Long userId);
}
