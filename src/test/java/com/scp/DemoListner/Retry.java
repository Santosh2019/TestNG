package com.scp.DemoListner;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class Retry implements IRetryAnalyzer{
	private static int count=0;
	private static int maxTry = 2;
    @SuppressWarnings("static-access")
	public boolean retry(ITestResult iTResult) {
		if(!iTResult.isSuccess()) {
			if(count<maxTry) {
				count++;
				iTResult.setStatus(iTResult.FAILURE);
				return true;
			}
			else {
				iTResult.setStatus(iTResult.FAILURE);
			}
		}
		else {
			iTResult.setStatus(iTResult.SUCCESS);
		}
			
		return false;
	}

}
