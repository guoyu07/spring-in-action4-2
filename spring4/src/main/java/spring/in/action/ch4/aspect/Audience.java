package spring.in.action.ch4.aspect;

import org.aspectj.lang.annotation.*;

/**
 * Created by private on 11.10.17.
 */
@Aspect
public class Audience {

    @Pointcut("execution(** spring.in.action.ch4.aspect.Performance.perform(..))")
    public void performance() {}

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }
}
