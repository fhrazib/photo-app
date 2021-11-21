package com.fh.photo.app.user.account.management.model;

public class Account {
    private Long id;
    private String username;
    private String accountName;

    public Account(Long id, String username, String accountName) {
        this.id = id;
        this.username = username;
        this.accountName = accountName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
