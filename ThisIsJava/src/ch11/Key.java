package ch11;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number=number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			key comparekey=(Key)obj;
			if(this.number==comparekey.number) {
				return true;
			}
		}
		return false;
	}

}
