package baitap.tuan08;

public class BarkManager {
	private String amThanh;

	public String getAmThanh() {
		return amThanh;
	}

	public void setAmThanh(String amThanh) {
		this.amThanh = amThanh;
	}
	public BarkManager() {
		
	}
	public BarkManager(String amThanh) {
		this.amThanh = amThanh;
	}
	
	/*public boolean equals(Object bark) {
		if(bark instanceof BarkManager) {
			BarkManager otherBark = (BarkManager)bark;
			if(this.amThanh.equalsIgnoreCase(otherBark.amThanh)) {
				return true;
			}
		}
		return false;
	}*/
	


}
