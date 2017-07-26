package com.controller;

import com.entity.Record;
import com.service.Service;
import com.util.Reader;
import com.view.RecordView;

public class Controller {

	private Reader reader;
	private RecordView view;
	private Service service;

	public Controller(Reader reader, RecordView view, Service service) {
		this.reader = reader;
		this.view = view;
		this.service = service;
	}

	public void doProcess() {
		Record record = reader.read();
		service.setRecord(record);
		view.show(service.getRecord());
	}

}
