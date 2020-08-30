package restClient;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;





@XmlRootElement()
public class Staff {
	private Long staffid;

	private String staffname;
	private String stafflastname;
	private String gender;
	private String email;
	private String city;
	
	
	//getter setter toString
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getStaffid() {
		return staffid;
	}
	public void setStaffid(Long staffid) {
		this.staffid = staffid;
	}
	public String getStaffname() {
		return staffname;
	}
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	public String getStafflastname() {
		return stafflastname;
	}
	public void setStafflastname(String stafflastname) {
		this.stafflastname = stafflastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Staff [staffid=" + staffid + ", staffname=" + staffname + ", stafflastname=" + stafflastname
				+ ", gender=" + gender + ", email=" + email + ", city=" + city + "]";
	}
	
}
