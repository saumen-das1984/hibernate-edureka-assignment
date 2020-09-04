package com.edureka.assignment2.crud.hbmxmlconf;

public class Branch {
	
	private int  branchId;
	private String branchName;
	private boolean branchStatus;
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public boolean isBranchStatus() {
		return branchStatus;
	}
	public void setBranchStatus(boolean branchStatus) {
		this.branchStatus = branchStatus;
	}
	
	

}
