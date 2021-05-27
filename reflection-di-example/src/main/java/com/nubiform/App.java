package com.nubiform;

import com.nubiform.di.ContainerService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = ContainerService.getObject(AccountService.class);

        accountService.join();
    }
}
