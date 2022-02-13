package com.init.MWC22.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@Entity
@Table(name = "developer")
public class Developer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@JsonProperty("name")
	@Column(name = "name")
	private String name;

	@JsonProperty("email")
	@Column(name = "email")
	private String email;

	@JsonProperty("category")
	@Column(name = "category")
	private Category category;

	@JsonProperty("phone")
	@Column(name = "phone")
	private String phone;

	@JsonProperty("date")
	@Column(name = "date")
	private Dates date;

	public Developer(int id, String name, String mail, Category category, String phone, Dates date) {
		this.id = id;
		this.name = name;
		this.email = mail;
		this.category = category;
		this.phone = phone;
		this.date = date;
	}

	public Developer(String name, String mail, Category category, String phone, Dates date) {

		this.name = name;
		this.email = mail;
		this.category = category;
		this.phone = phone;
		this.date = date;
	}

	public Developer() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@JsonValue
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Dates getDate() {
		return date;
	}

	public void setDate(Dates date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Developer [id=" + id + ", name=" + name + ", email=" + email + ", category=" + category.getDisplayName()
				+ ", phone=" + phone + ", date=" + date.getDisplayName() + "]";
	}

}
