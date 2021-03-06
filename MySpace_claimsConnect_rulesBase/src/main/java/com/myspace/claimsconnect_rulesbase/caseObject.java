package com.myspace.claimsconnect_rulesbase;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class caseObject implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("caseType")
	private java.lang.String caseType;
	@org.kie.api.definition.type.Label("claimtype")
	private java.lang.String claimtype;
	@org.kie.api.definition.type.Label("persona")
	private java.lang.String persona;
	@org.kie.api.definition.type.Label("assessor")
	private java.lang.String assessor;
	@org.kie.api.definition.type.Label("createdBy")
	private java.lang.String createdBy;
	@org.kie.api.definition.type.Label("creationTime")
	private java.time.LocalDateTime creationTime;
	@org.kie.api.definition.type.Label("description")
	private java.lang.String description;
	@org.kie.api.definition.type.Label("referenceNumber")
	private java.lang.String referenceNumber;

	@org.kie.api.definition.type.Label(value = "owner")
	private java.lang.String owner;

	@org.kie.api.definition.type.Label(value = "ownerRole")
	private java.lang.String ownerRole;

	public caseObject() {
	}

	public java.lang.String getCaseType() {
		return this.caseType;
	}

	public void setCaseType(java.lang.String caseType) {
		this.caseType = caseType;
	}

	public java.lang.String getClaimtype() {
		return this.claimtype;
	}

	public void setClaimtype(java.lang.String claimtype) {
		this.claimtype = claimtype;
	}

	public java.lang.String getPersona() {
		return this.persona;
	}

	public void setPersona(java.lang.String persona) {
		this.persona = persona;
	}

	public java.lang.String getAssessor() {
		return this.assessor;
	}

	public void setAssessor(java.lang.String assessor) {
		this.assessor = assessor;
	}

	public java.lang.String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(java.lang.String createdBy) {
		this.createdBy = createdBy;
	}

	public java.time.LocalDateTime getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(java.time.LocalDateTime creationTime) {
		this.creationTime = creationTime;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.String getReferenceNumber() {
		return this.referenceNumber;
	}

	public void setReferenceNumber(java.lang.String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public java.lang.String getOwner() {
		return this.owner;
	}

	public void setOwner(java.lang.String owner) {
		this.owner = owner;
	}

	public java.lang.String getOwnerRole() {
		return this.ownerRole;
	}

	public void setOwnerRole(java.lang.String ownerRole) {
		this.ownerRole = ownerRole;
	}

	public caseObject(java.lang.String caseType, java.lang.String claimtype,
			java.lang.String persona, java.lang.String assessor,
			java.lang.String createdBy, java.time.LocalDateTime creationTime,
			java.lang.String description, java.lang.String referenceNumber,
			java.lang.String owner, java.lang.String ownerRole) {
		this.caseType = caseType;
		this.claimtype = claimtype;
		this.persona = persona;
		this.assessor = assessor;
		this.createdBy = createdBy;
		this.creationTime = creationTime;
		this.description = description;
		this.referenceNumber = referenceNumber;
		this.owner = owner;
		this.ownerRole = ownerRole;
	}

}