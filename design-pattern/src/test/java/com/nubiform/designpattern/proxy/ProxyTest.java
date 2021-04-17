package com.nubiform.designpattern.proxy;

import com.nubiform.designpattern.singleton.Singleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class ProxyTest {

    @Test
    public void test() {
        Service service = new ServiceProxy(new ServiceImpl());

        service.runSomething();
    }
}