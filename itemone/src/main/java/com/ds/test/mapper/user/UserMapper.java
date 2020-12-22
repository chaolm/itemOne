package com.ds.test.mapper.user;

import com.ds.test.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author clm
 * @date 2020/11/23
 * hh
 **/
@Mapper
public interface UserMapper {
    List<User> getUser();

    void addUser(User user);

    User getUserByParam(Map map);

    void updateUser(User user);

    void updateUserPassword(User user);
}
