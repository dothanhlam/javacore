package org.catapult.app.javolution;


public class StringStruct extends BaseStruct {
	public Signed16 length;
	public Signed8[] data;
	
	public StringStruct(short size) {
		length = new Signed16();
		data = array(new Signed8[size]);		
	}
}
