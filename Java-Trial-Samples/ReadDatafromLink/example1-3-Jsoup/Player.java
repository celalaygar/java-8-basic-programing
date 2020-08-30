package getdatafromURL.example4;

public class Player {

	private String name;
	private String date;
	private String oldTeam;
	private String newTeam;
	private String status;
	private String value;
	public Player(String name, String date, String oldTeam, String newTeam, String status, String value) {
		super();
		this.name = name;
		this.date = date;
		this.oldTeam = oldTeam;
		this.newTeam = newTeam;
		this.status = status;
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getOldTeam() {
		return oldTeam;
	}
	public void setOldTeam(String oldTeam) {
		this.oldTeam = oldTeam;
	}
	public String getNewTeam() {
		return newTeam;
	}
	public void setNewTeam(String newTeam) {
		this.newTeam = newTeam;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return " name=" + name + ", date=" + date + ", oldTeam=" + oldTeam + ", newTeam=" + newTeam + ", status="
				+ status + ", value=" + value ;
	}

	
}
