package huy.it.onlineshop.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role implements Serializable{
	private static final long version = 1L;
	
	@Id
	@Column(name = "role_id")
	private String roleId;
	
	@Column(name="role_name", nullable = false, insertable = true)
	private String roleName;
	
	@ManyToMany
	private List<Account> accounts;

	public Role(String roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
}
