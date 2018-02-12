package com.capdemo.domain;

import java.math.BigDecimal;
import java.util.List;

<<<<<<< HEAD
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class SavingsAccount {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
    private int accountNumber;
    private BigDecimal accountBalance;
    
    @OneToMany(mappedBy = "savingsAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<SavingsTransaction> savingsTransactionList;
    
    
=======
public class SavingsAccount {

	private Long id;
    private int accountNumber;
    private BigDecimal accountBalance;
    private List<SavingsTransaction> savingsTransactionList;
>>>>>>> 9d06e21d25eece3da5d0fc05c563236a79f43443
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public BigDecimal getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}
	public List<SavingsTransaction> getSavingsTransactionList() {
		return savingsTransactionList;
	}
	public void setSavingsTransactionList(
			List<SavingsTransaction> savingsTransactionList) {
		this.savingsTransactionList = savingsTransactionList;
	}
    
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
