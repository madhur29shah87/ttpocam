package com.tt.table.model;

import org.springframework.stereotype.Repository;

@Repository
public class TtTable {
	
	private boolean availability = true;

	public boolean getAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
}
