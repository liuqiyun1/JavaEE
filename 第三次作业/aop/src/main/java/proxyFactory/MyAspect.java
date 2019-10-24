package proxyFactory;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class MyAspect implements MethodInterceptor {

    public void before(){
        System.out.println("前置方法");
    }
    public void after(){
        System.out.println("后置方法");
    }

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("此代理使用的是ProxyFactoryBean");
        before();
        Object obj=methodInvocation.proceed();
        after();
        return obj;
    }
}
