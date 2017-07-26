package com.view;

public class ReaderView {

	private final String INVITATION = "Enter ";
	private final String ERROR = "not correct";
	
	private String[] titles = { "name", "surname", "patronymic", "nickname", "skype", "mobilephone", "homephone", "anotherPhone",
			"group", "email", "comment", "postcode", "city", "street", "houseNumber", "flatNumber" };
	
	
	public void showInvitation(int index) {
		System.out.println(INVITATION + titles[index]);
	}
	
	public void showError() {
		System.out.println(ERROR);
	}
	
}
