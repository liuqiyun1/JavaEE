package aspectj;


import org.aspectj.lang.JoinPoint;

public class MyAspect  {

    public void before(JoinPoint joinPoint){
        System.out.println("前置方法");
    }
    public void after( JoinPoint joinPoint){
        System.out.println("后置方法");
    }
}
