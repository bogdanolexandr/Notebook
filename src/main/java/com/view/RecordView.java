package com.view;

import com.entity.Record;

public class RecordView {

	private final String NAME = "Name :";
	private final String SURNAME = "Surname :";
	private final String PATRONYMIC = "Patronymic :";
	private final String NICKNAME = "Nickname :";
	private final String SKYPE = "Skype :";
	private final String MOBILE_PHONE = "Mobile phone :";
	private final String HOME_PHONE = "Home phone :";
	private final String ANOTHER_PHONE = "Another phone :";
	private final String EMAIL = "e-mail :";
	private final String GROUPS = "Groups :";
	private final String COMMENT = "Comment :";
	private final String DATES_OF_CHANGES = "Dates of changes :";
	private final String LAST_CHANGE = "Last change :";
	private final String POSTCODE = "Postcode :";
	private final String CITY = "City :";
	private final String STREET = "Street :";
	private final String HOUSE_NUMBER = "House number :";
	private final String FLAT_NUMBER = "Flat number :";

	public void show(Record record) {

		System.out.println(NAME + record.getName());
		System.out.println(SURNAME + record.getSurname());
		System.out.println(PATRONYMIC + record.getPatronymic());
		System.out.println(NICKNAME + record.getNickName());
		System.out.println(SKYPE + record.getSkype());
		System.out.println(MOBILE_PHONE + record.getMobilePhone());
		System.out.println(HOME_PHONE + record.getHomePhoneNumber());
		System.out.println(ANOTHER_PHONE + record.getAnotherPhone());
		System.out.println(EMAIL + record.getEmail());
		System.out.println(GROUPS + record.getGroups());
		System.out.println(COMMENT + record.getComment());
		System.out.println(DATES_OF_CHANGES + record.getDatesOfChanges());
		System.out.println(LAST_CHANGE + record.getLastChange());
		System.out.println(POSTCODE + record.getAddress().getPostcode());
		System.out.println(CITY + record.getAddress().getCity());
		System.out.println(STREET + record.getAddress().getStreet());
		System.out.println(HOUSE_NUMBER + record.getAddress().getHouseNumber());
		System.out.println(FLAT_NUMBER + record.getAddress().getFlatNumber());

	}

}
