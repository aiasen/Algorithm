package dataDevide;

import java.util.ArrayList;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		System.out.println(ListUtils.collectionSplit(list));
		System.out.println(ListUtils.collectionMinMinus(list));
	}

}
