package com.example.demo.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "don")
public class Don {
	 @Id
	 @Column(name = "d")
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
	 @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	
	private String username;
	private String password;
	
	public Don(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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
	public Don() {
		super();
		// TODO Auto-generated constructor stub
	}
}
