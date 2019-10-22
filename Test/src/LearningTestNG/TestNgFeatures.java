package LearningTestNG;

import org.testng.annotations.Test;

public class TestNgFeatures {

	@Test
	public void test1() {
		System.out.println("Test 1");
		int i = 9 / 0; // Have this line to test check how dependsOnMethods is working
	}

	@Test(dependsOnMethods = "test1")
	public void test2() {
		System.out.println("Test 2");
	}

	@Test(dependsOnMethods = "test4")
	public void test3() {
		System.out.println("Test 3");
	}

	@Test
	public void test4() {
		System.out.println("Test 4");
	}

}
