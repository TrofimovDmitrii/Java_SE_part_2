package work_with_files.NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class ChannelBufferExp1 {
	public static void main(String[] args) {

		try (RandomAccessFile file = new RandomAccessFile(
				"test10.txt", "rw");
		     FileChannel channel = file.getChannel();) {

			ByteBuffer buffer = ByteBuffer.allocate(25);
			StringBuilder stih = new StringBuilder();

			int byteRead = channel.read(buffer);
			while (byteRead > 0) {
				System.out.println("Read " + byteRead);

				buffer.flip();

				while (buffer.hasRemaining()) {
					stih.append((char) buffer.get());
				}

				buffer.clear();
				byteRead = channel.read(buffer);
			}
			System.out.println(stih);

			String text = "\nThere are only two ways to live your life." +
					" One is as though nothing is a miracle. The other is as" +
					" though everything is a miracle.";

//			ByteBuffer byteBuffer2 = ByteBuffer.allocate(text.getBytes().length);
//			byteBuffer2.put(text.getBytes());
//			byteBuffer2.flip();
//			channel.write(byteBuffer2);

			ByteBuffer buffer3 = ByteBuffer.wrap(text.getBytes());
			channel.write(buffer3);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
