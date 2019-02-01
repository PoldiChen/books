package chapter4.concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {
	
	@Pointcut("execution(** concert.Performance.perform(..))")
	public void performance() {
		Movie movie = new Movie();
		movie.perform();
	}
	
	@Before("performance()")
	public void slienceCellPhone() {
		System.out.println("slience cell phone");
	}
	
	@Before("performance()")
	public void takeSeats() {
		System.out.println("take seat");
	}
	
	@AfterReturning("performance()")
	public void applause() {
		System.out.println("applause");
	}
	
	@AfterThrowing("performance()")
	public void demandRefund() {
		System.out.println("demand refund");
	}

}
