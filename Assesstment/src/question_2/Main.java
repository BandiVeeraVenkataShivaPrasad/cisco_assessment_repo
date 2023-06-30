package question_2;

import java.util.ArrayList;
import java.util.List;

public class Main extends ArrayFinder {

	public static void main(String[] args) {
		List<int[]> myList = new ArrayList<>();
        myList.add(new int[]{1, 2, 3, 4});
        myList.add(new int[]{5, 6, 7, 8});
        myList.add(new int[]{9, 10, 7, 12});
        int targetNumber = 7;
        findArrayWithTarget(myList,targetNumber);
	}

}