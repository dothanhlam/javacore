package org.catapult.app.javolution;

public class StudentStruct extends BaseStruct {
	public StringStruct name;
	public DateStruct birthday;

	public StudentStruct(short nameSize) {
		name = inner(new StringStruct(nameSize));
		birthday = inner(new DateStruct());
	}
}
