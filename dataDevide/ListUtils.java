package dataDevide;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListUtils {

	public static Integer collectionMinus(Collection<Integer> c1,
			Collection<Integer> c2) {
		Integer sum1 = 0, sum2 = 0;
		Iterator<Integer> i1 = c1.iterator();
		Iterator<Integer> i2 = c2.iterator();
		while (i1.hasNext()) {
			sum1 += i1.next();
		}
		while (i2.hasNext()) {
			sum2 += i2.next();
		}
		return sum1 - sum2 >= 0 ? (sum1 - sum2) : (sum2 - sum1);
	}

	public static List<Collectionsum> collectionSplit(Collection<Integer> c) {
		double len = (double) c.size();
		int maxnum = (int) Math.pow(2, len);
		List<Collectionsum> listCs = new ArrayList<Collectionsum>();
		for (int i = 1; i < maxnum - 1; i++) {
			String binary = Integer.toBinaryString(i);
			int len2 = binary.length();
			while (len - len2 > 0) {
				binary = "0" + binary;
				len2++;
			}
			char[] cs = binary.toCharArray();
			Iterator<Integer> iterator = c.iterator();
			int index = 0;
			Collection<Integer> c1 = new ArrayList<Integer>();
			Collection<Integer> c2 = new ArrayList<Integer>();
			while (iterator.hasNext()) {
				if (cs[index] == '1') {
					c1.add(iterator.next());
				} else {
					c2.add(iterator.next());
				}
				index++;
			}
			Collectionsum cols = new Collectionsum();
			cols.setC1(c1);
			cols.setC2(c2);
			listCs.add(cols);
		}
		return listCs;
	}

	public static Integer collectionMinMinus(Collection<Integer> col) {
		Integer min=-1;
		Iterator<Integer> iterator=col.iterator();
		while(iterator.hasNext()){
			min+=iterator.next();
		}
		List<Collectionsum> list=collectionSplit(col);
		Integer min1=0;
		for(Collectionsum s:list){
			min1=collectionMinus(s.getC1(), s.getC2());
			min=min1<min?min1:min;
		}
		return min;
	}
}
