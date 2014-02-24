package org.catapult.app.javolution;

import java.nio.ByteOrder;

import javolution.io.Struct;

public class BaseStruct extends Struct {

	@Override
	public ByteOrder byteOrder() {
		return ByteOrder.LITTLE_ENDIAN;
	}
	
}
