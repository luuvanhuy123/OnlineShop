package huy.it.onlineshop.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account implements Serializable{
	private static final long servision = 1L;
	
	@Id
	@Column(name="username")
	private String username;
	
	@Column(name="password", nullable = false, insertable = true, length = 100)
	private String password;
	
	@Column(name="active")
	private boolean active;
	
	@ManyToMany
	private List<Role> roles;

	public Account(String username, String password, boolean active) {
		super();
		this.username = username;
		this.password = password;
		this.active = active;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	
	
}
