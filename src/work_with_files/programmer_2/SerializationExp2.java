package work_with_files.programmer_2;

import work_with_files.programmer_1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationExp2 {
	public static void main(String[] args) {
		Employee bestEmployee;

		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("employees2.bin"))) {

			bestEmployee = (Employee) ois.readObject();
			System.out.println(bestEmployee);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
