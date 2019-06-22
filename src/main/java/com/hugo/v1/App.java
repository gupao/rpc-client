package com.hugo.v1;

import com.hugo.IHelloService;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        RpcProxyClient rpcProxyClient = new RpcProxyClient();

        IHelloService helloService = rpcProxyClient.clientProxy(IHelloService.class,"localhost",8080);

        String result = helloService.sayHello("xyh");

        System.out.println(result);
    }
}
