package ch14;

public class EqualsTest2 {
	public int x;
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof EqualsTest2) {
			EqualsTest2 var=(EqualsTest2)obj;
			if(this.x==var.x) {
				return true;
			}
		}
		return false;
	}
}
