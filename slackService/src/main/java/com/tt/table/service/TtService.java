package com.tt.table.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tt.table.model.TtTable;
@Service
public class TtService {
	@Autowired
	private TtTable ttTable;
	public String getTableStatus(){
		if(ttTable.getAvailability())
			return "TT Table is available. Enjoy your play. Suggestions : 1. Use /book to book the Table";
		else
			return "Table is busy. We will update you once available";
	}
}
