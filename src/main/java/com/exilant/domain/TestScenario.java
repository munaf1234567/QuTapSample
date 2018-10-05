package com.exilant.domain;

import java.util.ArrayList;

public class TestScenario {

	
	private String testScenId;
	private String testScenName;
	private String testScenDesc;
	private ArrayList<TestCase> testCaseList;
	public String getTestScenId() {
		return testScenId;
	}
	public void setTestScenId(String testScenId) {
		this.testScenId = testScenId;
	}
	public String getTestScenName() {
		return testScenName;
	}
	public void setTestScenName(String testScenName) {
		this.testScenName = testScenName;
	}
	public String getTestScenDesc() {
		return testScenDesc;
	}
	public void setTestScenDesc(String testScenDesc) {
		this.testScenDesc = testScenDesc;
	}
	public ArrayList<TestCase> getTestCaseList() {
		return testCaseList;
	}
	public void setTestCaseList(ArrayList<TestCase> testCaseList) {
		this.testCaseList = testCaseList;
	}
	
	
	
}
