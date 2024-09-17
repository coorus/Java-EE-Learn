package io.github.coorus.section1_17;

import io.github.coorus.section1_17.proxy.Landlord;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;


@SpringBootApplication
public class Section117Application {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Landlord.class);

        enhancer.setCallback((MethodInterceptor) (obj, method, args1, proxy) -> {
            System.out.println("增强方法：带租客看房！");
            return proxy.invokeSuper(obj, args1);
        });

        Landlord landlord = (Landlord) enhancer.create();
        landlord.signContract();
    }
}
