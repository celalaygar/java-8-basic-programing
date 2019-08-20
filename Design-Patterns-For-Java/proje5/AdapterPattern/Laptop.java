package proje5.AdapterPattern;

public class Laptop implements Device {

	Computer computer;
	
	
	@Override
	public void toRun(String OsName, String name) {
		if (OsName.equals("Mint")) {
			System.out.println("Running Operating System's Name : "+ name);
		} else if (
				OsName.equalsIgnoreCase("MacOS") || 
				OsName.equalsIgnoreCase("Ubuntu") || 
				OsName.equalsIgnoreCase("Microsoft") || 
				OsName.equalsIgnoreCase("KaliLinux")) {
			computer = new Computer(OsName);
			computer.toRun(OsName, name);
		} 
	}

}
