package question_2;
/*
 * Write a method that answers the following problem: Accept as input:
 · list: an unordered list of arrays each with 4 elements.
 · target: an integer
 *
 Find and display the complete array that contains the provided target number.
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFinder {
	//This method accepts an unordered list of arrays and an integer
	public static void findArrayWithTarget(List<int[]> list, int target){
		if(list.size()==0) {
			System.out.println("Your List is EMPTY");
			return;
		}
		List<int[]> temp = new ArrayList<>(); // to get multiple arrays with provided target number
		for(int[] array : list) {
			for(int element:array) {
				if(element==target) {
					temp.add(array);
				}
			}
		}
		if(temp.size()!=0) {
			System.out.println("Target Array(s):");
			for(int[] array: temp) {
				System.out.println(Arrays.toString(array));
				}
		}else {
			System.out.println("Target number was not found in any Array elements");
		}
	}
}
