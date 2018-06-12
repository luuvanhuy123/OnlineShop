package huy.it.onlineshop.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer implements Serializable{
	private static final long version = 1L;
	
	@Id
	@Column(name="customer_id")
	private Long customerId;
	
	@Column(name="name", nullable = false, insertable = true, length = 100)
	private String name;
	
	@Column(name="age", nullable = false, insertable = true)
	private int age;
	
	@Column(name="address", nullable = false, insertable = true)
	private String address;
	
	@Column(name = "phone", nullable = false, insertable = true)
	private int phone;
	
	@Column(name="email", nullable = false, insertable = true, length = 100)
	private String email;
	
	public Customer(Long customerId, String name, int age, String address, int phone, String email) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public Customer(Long customerId, String name, int age, String address, int phone, String email, Account account) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.account = account;
	}

	@OneToOne
	@JoinColumn
	private Account account;
	
	@OneToMany
	@JoinColumn(name="customer_id")
	private List<Bill> bills;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<Bill> getBills() {
		return bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}
	
	
}
