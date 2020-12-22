package com.ds.test.service.user;

import com.ds.test.dto.User;

import java.util.List;
import java.util.Map;

/**
 * @author clm
 * @date 2020/11/23
 * hh
 **/
public interface UserService {
    List<User> getUser();

    String addUser(User user);

    String loginByPassword(User user);

    String updateUserInfoByUserCode(User user);

    String updateUserPassword(User user);
}
