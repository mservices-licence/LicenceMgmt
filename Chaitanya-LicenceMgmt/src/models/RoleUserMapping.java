package models;

// Generated 5 Apr, 2016 3:49:22 PM by Hibernate Tools 4.3.1

/**
 * RoleUserMapping generated by hbm2java
 */
public class RoleUserMapping implements java.io.Serializable {

	private RoleUserMappingId id;
	private Role role;
	private User user;

	public RoleUserMapping() {
	}

	public RoleUserMapping(RoleUserMappingId id, Role role, User user) {
		this.id = id;
		this.role = role;
		this.user = user;
	}

	public RoleUserMappingId getId() {
		return this.id;
	}

	public void setId(RoleUserMappingId id) {
		this.id = id;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
