package dataDevide;

//import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

//import org.junit.Before;
//import org.junit.Test;

public class ListUtilsTest {
	List<Integer> c1;
	List<Integer> c2;

//	@Before
	public void setUp() throws Exception {
		c1=new ArrayList<Integer>();
		c2=new ArrayList<Integer>();
		c1.add(1);
		c1.add(2);
		c2.add(3);
		c2.add(4);
		c2.add(5);
	}

//	@Test
	public void testCollectionMinus() {
		Integer integer=ListUtils.collectionMinus(c1, c2);
		System.out.println(integer);
	}

}
