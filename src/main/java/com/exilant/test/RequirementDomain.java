package com.exilant.test;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="Requirement")
public class RequirementDomain {
	@Id
	private String requirementId;
	private String projectId; 
	private String requirementDocumentName;
	private String useCases;
	private String description;
	public String getRequirementId() {
		return requirementId;
	}
	public void setRequirementId(String requirementId) {
		this.requirementId = requirementId;
	}
	public String getRequirementDocumentName() {
		return requirementDocumentName;
	}
	public void setRequirementDocumentName(String requirementDocumentName) {
		this.requirementDocumentName = requirementDocumentName;
	}
	
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getUseCases() {
		return useCases;
	}
	public void setUseCases(String useCases) {
		this.useCases = useCases;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
