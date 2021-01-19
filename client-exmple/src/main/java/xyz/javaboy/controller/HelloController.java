package xyz.javaboy.controller;


import org.springframework.stereotype.Controller;

import xyz.javaboy.register.annotation.RpcReference;


/**
 * @author XDD
 * @project rpc-demo
 * @date 2021/1/18
 * @description Good Good Study,Day Day Up.
 */
@Controller
public class HelloController {

    @RpcReference
    private HelloService helloService;

    @RpcReference(group = "1",version = "1.0")
    private HelloService helloService2;

    public String hello(String name) {
        return helloService.hello(name);
    }

    public String hello2( String name) {
        return helloService2.hello(name);
    }
}
