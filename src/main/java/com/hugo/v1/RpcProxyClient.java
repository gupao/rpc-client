package com.hugo.v1;

import java.lang.reflect.Proxy;

/**
 * created by xuyahui on 2019/6/18
 */
public class RpcProxyClient {

    public <T> T clientProxy(final Class<T> interfaceClazz, final String host, final int port){
        return (T)Proxy.newProxyInstance(interfaceClazz.getClassLoader(),
                new Class<?>[]{interfaceClazz},new RemoteInvocationHandler(host, port));
    }

}
