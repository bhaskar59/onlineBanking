package com.onlineBanking.entity;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AccountDetails {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AccountId")
	@Basic(optional = false)
	private Integer Account_id;
	
	@Column(name="user_id")
	@Basic(optional = false)
	private Integer user_id;	
	
	@Column(name="Credit")
	@Basic(optional = false)
	private Integer credit;	
	
	@Column(name="Debit")
	@Basic(optional = false)
	private Integer debit;	
	
	@Column(name="AccountBalance")
	@Basic(optional = false)
	private Integer AccountBalance;
	
	@Column(name="AccountType")
	@Basic(optional = false)
	private String AccountType;
	
	@Column(name ="createdBy")
	@Basic(optional=false)
	private Integer createdBy;
	
	@Column(name ="createdDate")
	@Basic(optional=false)
	private Date createdDate;
	
	@Column(name ="LastModifiedBy")
	@Basic(optional=false)
	private Integer lastModifiedBy;
	
	@Column(name ="LastModifiedDate")
	@Basic(optional=false)
	private Date lastModifiedDate;

	public Integer getAccount_id() {
		return Account_id;
	}

	public void setAccount_id(Integer account_id) {
		Account_id = account_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public Integer getDebit() {
		return debit;
	}

	public void setDebit(Integer debit) {
		this.debit = debit;
	}

	public Integer getAccountBalance() {
		return AccountBalance;
	}

	public void setAccountBalance(Integer accountBalance) {
		AccountBalance = accountBalance;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Integer getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(Integer lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

}
