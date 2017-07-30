package com.service;

import com.entity.Record;
import com.exception.NotUniqRecord;

public class Service {

	private final String UNIQ_NAME = "ivan";

	private Record record;

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) throws NotUniqRecord {
		if (isUniq(record)) {
			this.record = record;
		} else {
			throw new NotUniqRecord(record.getName());
		}
	}

	private boolean isUniq(Record record) {
		if (record.getName().equals(UNIQ_NAME)) {
			return false;
		}
		return true;
	}

}
