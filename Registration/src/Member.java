
public class Member {
	private String uname,pasward,email,phone;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPasward() {
		return pasward;
	}

	public void setPasward(String pasward) {
		this.pasward = pasward;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Member(String uname, String pasward, String email, String phone) {
		super();
		this.uname = uname;
		this.pasward = pasward;
		this.email = email;
		this.phone = phone;
	}

	public Member() {
		super();
	}
	

}
