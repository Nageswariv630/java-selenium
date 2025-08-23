package v1;

import org.testng.annotations.Test;

public class TestNGDemo {
	@Test(groups= {"smoke"})
	public void test1() {
		System.out.println("test1 case exceution!!!");
	}
	@Test(groups= {"sanity"})
	public void test2() {
		System.out.println("test2 case exceution!!!");
	}
	@Test(groups= {"regression"})
	public void test3() {
		System.out.println("test3 case exceution!!!");
	}
	@Test(groups= {"smoke","regression"})
	public void test4() {
		System.out.println("test4 case exceution!!!");
	}
}
