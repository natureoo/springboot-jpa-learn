package com.yanggaochao.springboot.learn.springbootjpalearn.security.dao;


import com.yanggaochao.springboot.learn.springbootjpalearn.security.domain.dao.RoleDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RoleDao extends JpaRepository<RoleDO, Long> {
    @Query("SELECT R FROM RoleDO R ,RoleUserDO RU WHERE R.id = RU.roleId AND RU.userId = :userId")
    List<RoleDO> findRolesByUser(@Param("userId") Long userId);
}
