/*
 * The first sample of the textbook as a simple practice. 
 */

package chapter02;
import java.util.ArrayList;
import java.util.List;

public class ListExercise {
	public static void main(String[] args) {
		// Prepare a List to store String types
		List<String> names = new ArrayList<>();
		// Store data of String type
		names.add("太郎");
		names.add("ジロウ");
		names.add("SABUROU");
		// Print data one by one
		for (String name : names) {
			System.out.println(name);
		}
	}
}