package com.fhr.photo.app.user.external.account;

import com.fhr.photo.app.user.model.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="user-account-managements-ws")
public interface AccountClientService {

    @GetMapping("/accounts")
    public List<Account> getAccounts();
}
