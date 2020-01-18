package com.yanggaochao.springboot.learn.springbootjpalearn.security.dao;


import com.yanggaochao.springboot.learn.springbootjpalearn.security.domain.dao.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface UserDao extends JpaRepository<UserDO, Long> {
    UserDO findByAccount(String account);

    List<UserDO> findByIdGreaterThan(Long id);

    @Query("SELECT U FROM UserDO U ,RoleUserDO RU WHERE U.id = RU.userId AND RU.roleId = :roleId")
    List<UserDO> findUsersByRole(@Param("roleId") Long roleId);
}
