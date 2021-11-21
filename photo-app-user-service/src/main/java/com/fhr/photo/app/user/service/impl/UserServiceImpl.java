package com.fhr.photo.app.user.service.impl;

import com.fhr.photo.app.user.external.account.AccountClientService;
import com.fhr.photo.app.user.model.Account;
import com.fhr.photo.app.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private AccountClientService accountClientService;

    @Autowired
    public UserServiceImpl(AccountClientService accountClientService) {
        this.accountClientService = accountClientService;
    }

    @Override
    public List<Account> getAccounts() {
        List<Account> accounts = accountClientService.getAccounts();
        return accounts;
    }
}
