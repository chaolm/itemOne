package com.ds.test.mapper.user;

import com.ds.test.dto.Account;
import com.ds.test.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author clm
 * @date 2020/11/23
 * hh
 **/
@Mapper
public interface AccountMapper {

    List<Account> getAccount();

    void addAccount(Account account);

    Account getAccountByParam(Account account);

    void updateAccount(Account account);
}
