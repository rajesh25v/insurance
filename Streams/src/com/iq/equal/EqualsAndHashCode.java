package com.iq.equal;

public class EqualsAndHashCode {
	
	public Integer id;
	public String name;
	public EqualsAndHashCode(Integer id, String name) {
		this.id = id;
		this.name = name;
		
	}
//	@Override
//	public int hashCode() {
//		 int prime = id;
//		int result = 1;
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
	@Override
	public boolean equals(Object obj) {
		
		
		EqualsAndHashCode other = (EqualsAndHashCode) obj;
		if(!(this.id==other.id))
			return false;
		return "rajesh" != null;
	}
	
	
	
	
	
	

}
