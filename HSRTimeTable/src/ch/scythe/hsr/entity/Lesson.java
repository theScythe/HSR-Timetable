package ch.scythe.hsr.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import ch.scythe.hsr.error.EnumNotFoundException;

public class Lesson {

	private String type;
	private final List<TimeUnit> timeUnits = new ArrayList<TimeUnit>();
	private final List<String> lecturers = new ArrayList<String>();
	private String identifier;
	private String room;

	public void setType(String type) {
		this.type = type;

	}

	public String getType() {
		return type;
	}

	public void addTimeUnit(Integer timeUnitId) throws EnumNotFoundException {
		timeUnits.add(TimeUnit.findById(timeUnitId));
	}

	public List<TimeUnit> getTimeUnits() {
		return Collections.unmodifiableList(timeUnits);
	}

	@Override
	public String toString() {
		return "<Lesson identifier=" + identifier + " type=" + type + ", timeUnits=" + timeUnits + " >";
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setRoom(String room) {
		this.room = room;

	}

	public String getRoom() {
		return room;
	}

	public void addLecturer(String lecturer) {
		this.lecturers.add(lecturer);
	}

	public String getLecturersAsString(String delimiter) {
		StringBuilder result = new StringBuilder();
		for (Iterator<String> i = lecturers.iterator(); i.hasNext();) {
			result.append(i.next());
			if (i.hasNext()) {
				result.append(delimiter);
			}
		}
		return result.toString();
	}
}