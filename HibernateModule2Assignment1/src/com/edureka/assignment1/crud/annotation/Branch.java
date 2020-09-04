package com.edureka.assignment1.crud.annotation;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity 
@Table(name = "branch")
public class Branch {

	@Id 
	private int  branchId;
	private String branchName;
	private boolean branchStatus;
	
}
