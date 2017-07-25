package com.entity;

import java.util.Date;
import java.util.Set;

public class Record {

	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String nickName;
	private String comment;
	private Set<Group> groups;
	private String homePhoneNumber;
	private String mobilePhone;
	private String anotherPhone;
	private String email;
	private String skype;
	private Address address;
	private Set<Date> datesOfChanges;
	private Date lastChange;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Set<Group> getGroups() {
		return groups;
	}

	public void setGroups(Set<Group> groups) {
		this.groups = groups;
	}

	public String getHomePhoneNumber() {
		return homePhoneNumber;
	}

	public void setHomePhoneNumber(String homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getAnotherPhone() {
		return anotherPhone;
	}

	public void setAnotherPhone(String anotherPhone) {
		this.anotherPhone = anotherPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set<Date> getDatesOfChanges() {
		return datesOfChanges;
	}

	public void setDatesOfChanges(Set<Date> datesOfChanges) {
		this.datesOfChanges = datesOfChanges;
	}

	public Date getLastChange() {
		return lastChange;
	}

	public void setLastChange(Date lastChange) {
		this.lastChange = lastChange;
	}

}
