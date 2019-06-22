package com.hugo.v2;

import com.hugo.v1.RpcProxyClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * created by xuyahui on 2019/6/22
 */
@Configuration
public class SpringConfig {

    @Bean("rpcProxyClient")
    public RpcProxyClient proxyClient(){
        return new RpcProxyClient();
    }

}
