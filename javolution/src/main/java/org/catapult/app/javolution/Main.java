package org.catapult.app.javolution;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
/*		String name = "Do Quoc Khanh";
		StudentStruct student = new StudentStruct((short)name.length());
		student.name.length.set((short)name.length());		
		for (int i = 0; i < name.length(); i ++) {
			student.name.data[i].set(name.getBytes()[i]);
		}
		
		student.birthday.day.set((byte)25);
		student.birthday.month.set((byte)4);
		student.birthday.year.set((short)2011);

		OutputStream out = new FileOutputStream("test.bin");
		student.write(out);
		out.flush();
		out.close(); */
		
		RandomAccessFile file = new RandomAccessFile("test.bin", "r");
		byte[] buffer = new byte[(int)file.length()];
		file.read(buffer);
		short nameSize = ByteBuffer.wrap( buffer ).order( ByteOrder.LITTLE_ENDIAN ).getShort();
		StudentStruct studentRead = new StudentStruct(nameSize);
		studentRead.name.length.set(nameSize);
		byte nameBuffer[] = new byte[nameSize];
		for (int i = 0; i < nameSize; i ++) {
			nameBuffer[i] = ByteBuffer.wrap( buffer ).order( ByteOrder.LITTLE_ENDIAN ).get(2 + i);
			studentRead.name.data[i].set(nameBuffer[i]);
			System.out.print(nameBuffer[i] + " ");
		}
		System.out.println();
		System.out.println(studentRead.name.size());
		int totalNameSize = studentRead.name.size();
		studentRead.birthday.year.set(ByteBuffer.wrap( buffer ).order( ByteOrder.LITTLE_ENDIAN ).getShort(totalNameSize));
		studentRead.birthday.month.set(ByteBuffer.wrap( buffer ).order( ByteOrder.LITTLE_ENDIAN ).get(totalNameSize + 2));
		studentRead.birthday.day.set(ByteBuffer.wrap( buffer ).order( ByteOrder.LITTLE_ENDIAN ).get(totalNameSize + 2 + 1));

		System.out.println("month = " + studentRead.birthday.day.get());
		file.close();
	}
}
