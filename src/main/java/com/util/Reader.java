package com.util;

import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.entity.Address;
import com.entity.Group;
import com.entity.Record;
import com.view.ReaderView;

public class Reader {

	private final int NUMBER_OF_FIELDS = 16;
	private Checker checker = new Checker();
	private Scanner scanner = new Scanner(System.in);
	private Record record = new Record();
	private Address address = new Address();
	private ReaderView view;

	private int index = 0;

	public Reader(ReaderView view) {
		this.view = view;
	}

	public Record read() {
		String message = null;
		boolean success = false;

		while (index < NUMBER_OF_FIELDS) {
			view.showInvitation(index);
			message = scanner.nextLine();

			switch (index) {
			case 0:
				success = setName(message);
				break;
			case 1:
				success = setSurname(message);
				break;
			case 2:
				success = setPatronymic(message);
				break;
			case 3:
				success = setNickName(message);
				break;
			case 4:
				success = setSkype(message);
				break;
			case 5:
				success = setMobilePhone(message);
				break;
			case 6:
				success = setHomePhone(message);
				break;
			case 7:
				success = setAnotherPhone(message);
				break;
			case 8:
				success = setGroup(message);
				break;
			case 9:
				success = setEmail(message);
				break;
			case 10:
				success = setComment(message);
				break;
			case 11:
				success = setPostcode(message);
				break;
			case 12:
				success = setCity(message);
				break;
			case 13:
				success = setStreet(message);
				break;
			case 14:
				success = setHouseNumber(message);
				break;
			case 15:
				success = setFlateNumber(message);
				break;
			}

			if (success) {
				index++;
				success = false;
			} else {
				view.showError();
			}

		}
		index = 0;
		record.setAddress(address);
		Date now = new Date();
		Set<Date> dates = new HashSet<>();
		dates.add(now);
		record.setDatesOfChanges(dates);
		record.setLastChange(now);
		return record;
	}

	private boolean setName(String message) {
		if (checker.check(message, Checker.NAME_PATTERN)) {
			record.setName(message);
			return true;
		}
		return false;
	}

	private boolean setSurname(String message) {
		if (checker.check(message, Checker.NAME_PATTERN)) {
			record.setSurname(message);
			return true;
		}
		return false;
	}

	private boolean setPatronymic(String message) {
		if (checker.check(message, Checker.NAME_PATTERN)) {
			record.setPatronymic(message);
			return true;
		}
		return false;
	}

	private boolean setNickName(String message) {
		if (checker.check(message, Checker.NICK_PATTERN)) {
			record.setNickName(message);
			return true;
		}
		return false;
	}

	private boolean setSkype(String message) {
		if (checker.check(message, Checker.NICK_PATTERN)) {
			record.setSkype(message);
			return true;
		}
		return false;
	}

	private boolean setMobilePhone(String message) {
		if (checker.check(message, Checker.PHONE_PATTERN)) {
			record.setMobilePhone(message);
			return true;
		}
		return false;
	}

	private boolean setHomePhone(String message) {
		if (checker.check(message, Checker.PHONE_PATTERN)) {
			record.setHomePhoneNumber(message);
			return true;
		}
		return false;
	}

	private boolean setAnotherPhone(String message) {
		if (checker.check(message, Checker.PHONE_PATTERN)) {
			record.setAnotherPhone(message);
			return true;
		}
		return false;
	}

	private boolean setGroup(String message) {
		if (checker.check(message, Checker.ENUM_PATTERN)) {
			Set<Group> groups = new HashSet<>();
			switch (message) {
			case "friends":
				groups.add(Group.FRIENDS);
				break;
			case "relatives":
				groups.add(Group.RELATIVES);
				break;
			case "colleagues":
				groups.add(Group.COLLEAGUES);
				break;
			}
			record.setGroups(groups);
			return true;
		}
		return false;
	}

	private boolean setEmail(String message) {
		if (checker.check(message, Checker.EMAIL_PATTERN)) {
			record.setEmail(message);
			return true;
		}
		return false;
	}

	private boolean setComment(String message) {
		record.setComment(message);
		return true;
	}

	private boolean setPostcode(String message) {
		if (checker.check(message, Checker.POST_CODE_PATTERN)) {
			address.setPostcode(message);
			return true;
		}
		return false;
	}

	private boolean setCity(String message) {
		if (checker.check(message, Checker.CITY_STREET_PATTERN)) {
			address.setCity(message);
			return true;
		}
		return false;
	}

	private boolean setStreet(String message) {
		if (checker.check(message, Checker.CITY_STREET_PATTERN)) {
			address.setStreet(message);
			return true;
		}
		return false;
	}

	private boolean setHouseNumber(String message) {
		if (checker.check(message, Checker.HOUSE_NUMBER_PATTERN)) {
			address.setHouseNumber(Integer.valueOf(message));
			return true;
		}
		return false;
	}

	private boolean setFlateNumber(String message) {
		if (checker.check(message, Checker.HOUSE_NUMBER_PATTERN)) {
			address.setFlatNumber(Integer.valueOf(message));
			return true;
		}
		return false;
	}

}
