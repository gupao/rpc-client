package com.hugo.v2;

import com.hugo.IHelloService;
import com.hugo.IPayService;
import com.hugo.v1.RpcProxyClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class AppPlus
{
    public static void main( String[] args )
    {
//        RpcProxyClient rpcProxyClient = new RpcProxyClient();

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        RpcProxyClient rpcProxyClient = context.getBean(RpcProxyClient.class);
        IHelloService helloService = rpcProxyClient.clientProxy(IHelloService.class,"localhost",8080);

        String result = helloService.sayHello("xyh");

        System.out.println(result);

        IPayService payService = rpcProxyClient.clientProxy(IPayService.class,"localhost",8080);
        String payResult = payService.pay("99.8");
        System.out.println(payResult);

    }
}
