package com.exilant.domain;

import java.util.ArrayList;

public class Requirement {
	
	private String requirementId;
	private String requirementName;
	private String requirementCases;
	private String requirDescri;
	private ArrayList<TestScenario> testSceList;
	public String getRequirementId() {
		return requirementId;
	}
	public void setRequirementId(String requirementId) {
		this.requirementId = requirementId;
	}
	public String getRequirementName() {
		return requirementName;
	}
	public void setRequirementName(String requirementName) {
		this.requirementName = requirementName;
	}
	public String getRequirementCases() {
		return requirementCases;
	}
	public void setRequirementCases(String requirementCases) {
		this.requirementCases = requirementCases;
	}
	public String getRequirDescri() {
		return requirDescri;
	}
	public void setRequirDescri(String requirDescri) {
		this.requirDescri = requirDescri;
	}
	public ArrayList<TestScenario> getTestSceList() {
		return testSceList;
	}
	public void setTestSceList(ArrayList<TestScenario> testSceList) {
		this.testSceList = testSceList;
	}
	
	
	

}
