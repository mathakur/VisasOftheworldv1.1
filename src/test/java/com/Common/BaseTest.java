package com.Common;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {





	/** The start time. */
	public long startTime = 0;

	/** The method num. */
	public int methodNum = 0;


	@BeforeMethod()
	public void printTimeStart(Method method) {
		methodNum = methodNum + 1;
		System.out.println("<.<.<.<.<.<.<.<.<.<.< Starting method " + methodNum + "::" + method.getName() + "<.<.<.<.<.<.<.<.<.<.<");
		startTime = System.currentTimeMillis();
	}

	/*@AfterMethod
    public void takeScreenShotOnFailure(ITestResult testResult) throws IOException { 
    	if (testResult.getStatus() == ITestResult.FAILURE) { 
    		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
    		FileUtils.copyFile(scrFile, new File("errorScreenshots\\" + testResult.getName() + "-" 
    				+ Arrays.toString(testResult.getParameters()) +  ".jpg"));
    	}
	 */


}  





