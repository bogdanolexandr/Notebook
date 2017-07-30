package com.controller;

import com.entity.Record;
import com.exception.NotUniqRecord;
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
		while (true) {
			Record record = reader.read();
			try {
				service.setRecord(record);
				break;
			} catch (NotUniqRecord e) {
				view.showError(e.getMessage());
			}
		}
		view.show(service.getRecord());
	}

}
