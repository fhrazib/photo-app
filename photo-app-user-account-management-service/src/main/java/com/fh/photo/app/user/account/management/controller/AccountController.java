package com.fh.photo.app.user.account.management.controller;


import com.fh.photo.app.user.account.management.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("accounts")
public class AccountController {

    @GetMapping
    public List<Account> getAccounts() {
        List<Account> accounts = new ArrayList<>();

        Account a1 = new Account(1L, "razib.reg@gmail.com", "Fakrul Hasan");
        accounts.add(a1);

        Account a2 = new Account(Long.valueOf(2L), "tania@gmail.com", "Kazi Tania");
        accounts.add(a2);

        return accounts;
    }

    @GetMapping("/status/check")
    public String status() {
        return "Account controller service working!";
    }
}
