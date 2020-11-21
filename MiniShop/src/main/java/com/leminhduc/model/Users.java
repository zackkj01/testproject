package com.leminhduc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
 
@SuppressWarnings("serial")
@Entity
@Table(name = "users", catalog = "testdb")
public class Users implements java.io.Serializable {
 
    private Integer id;
    private String username;
    private String password;
    
    
	public Users() {

	}
    
	public Users(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
    @Id
    @GeneratedValue(strategy = IDENTITY)
 
    @Column(name = "id", unique = true, nullable = false)
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "username", length = 30)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name = "password", length = 32)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

    
}
