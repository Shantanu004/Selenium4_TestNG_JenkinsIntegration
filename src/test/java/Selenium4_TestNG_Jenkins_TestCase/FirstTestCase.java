package Selenium4_TestNG_Jenkins_TestCase;

import org.testng.annotations.Test;

import Selenium4_TestNG_Jenkins_TestClass.FirstTestClass;

public class FirstTestCase extends FirstTestClass {
     
	@Test
	public void testcase1 () {

		System.out.println("This testcase 1");
	}

	@Test
	public void testcase2 () {

		System.out.println("This testcase 2");
	}
	
	@Test
	public void testcase3 () {

		System.out.println("This testcase 3");
	}

}
