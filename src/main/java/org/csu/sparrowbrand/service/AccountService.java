package org.csu.sparrowbrand.service;

import org.csu.sparrowbrand.domain.Account;

public interface AccountService {

    Account getAccount(String username) ;

    Account getAccount(String username, String password) ;

    public void insertAccount(Account account) ;

    public void updateAccount(Account account) ;

}
