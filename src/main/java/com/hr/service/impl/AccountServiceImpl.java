package com.hr.service.impl;

import com.hr.dao.IAccountDao;
import com.hr.dao.impl.AccountDaoImpl;
import com.hr.service.IAccountService;

public class AccountServiceImpl implements IAccountService {


    public AccountServiceImpl() {
        System.out.println("AccountServiceImpl创建了");
    }

    public void saveAccount() {
        System.out.println("service中的saveAccount执行了 ");
    }

    private void init() {
        System.out.println("对象初始化了");
    }

    private void destory() {
        System.out.println("对象销毁了");
    }
}
