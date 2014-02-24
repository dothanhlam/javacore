package org.catapult.app.javolution;


public class DateStruct extends BaseStruct{
	public Signed16 year;
	public Signed8 month;
	public Signed8 day;
	
	public DateStruct() {
		year = new Signed16();
		month = new Signed8();
		day = new Signed8();
	}
}
