package dataDevide;

import java.util.Collection;

public class Collectionsum {
	private Collection<Integer> c1;
	private Collection<Integer> c2;

	public Collection<Integer> getC1() {
		return c1;
	}

	public void setC1(Collection<Integer> c1) {
		this.c1 = c1;
	}

	public Collection<Integer> getC2() {
		return c2;
	}

	public void setC2(Collection<Integer> c2) {
		this.c2 = c2;
	}

	@Override
	public String toString() {
		
		return "("+c1.toString()+c2.toString()+")";
	}

}
