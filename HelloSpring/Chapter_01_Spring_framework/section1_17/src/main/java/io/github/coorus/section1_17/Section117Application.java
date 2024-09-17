package io.github.coorus.section1_17;

import io.github.coorus.section1_17.proxy.ILandlord;
import io.github.coorus.section1_17.proxy.Landlord;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@SpringBootApplication
public class Section117Application {

    public static void main(String[] args) {
        Landlord landlord = new Landlord();
        ILandlord landlordProxy = (ILandlord) Proxy.newProxyInstance(
                Landlord.class.getClassLoader(),
                Landlord.class.getInterfaces(),
                //new InvocationHandler() {
                //    @Override
                //    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //        System.out.println("带租客看房");
                //        return method.invoke(landlord, args);
                //    }
                //}
                ((proxy, method, args1) -> {
                    System.out.println("带租客看房");
                    return method.invoke(landlord, args);
                })
        );
        landlordProxy.signContract();
    }

}
