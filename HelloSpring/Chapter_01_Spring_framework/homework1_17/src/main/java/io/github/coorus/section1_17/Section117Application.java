package io.github.coorus.section1_17;


import io.github.coorus.section1_17.service.IUserService;
import io.github.coorus.section1_17.service.UserService;
import io.github.coorus.section1_17.user.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Proxy;

@SpringBootApplication
public class Section117Application {

    public static void main(String[] args) {
        UserService userService = new UserService();

        IUserService userServiceProxy = (IUserService)Proxy.newProxyInstance(
                UserService.class.getClassLoader(),
                UserService.class.getInterfaces(),
                ((proxy, method, args1) -> {
                    System.out.println("代理增强方法：Add");
                    return method.invoke(userService, args1);
                })
        );
        
        userServiceProxy.add(new User(1001, "zhao"));
        userServiceProxy.add(new User(1002, "yin"));
        userServiceProxy.add(new User(1003, "wang"));
        userServiceProxy.add(new User(1004, "xxx"));
        System.out.println("删除前：" + userService.getUserMap());

        userServiceProxy.remove(1003);

        System.out.println("删除后：" + userService.getUserMap());


    }

}
