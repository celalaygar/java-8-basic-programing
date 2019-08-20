package proje5.AdapterPattern.Computer;

import proje5.AdapterPattern.OS.KaliLinux;
import proje5.AdapterPattern.OS.MacOs;
import proje5.AdapterPattern.OS.Microsoft;
import proje5.AdapterPattern.OS.OperatingSystems;
import proje5.AdapterPattern.OS.Ubuntu;

public class Computer implements Device {

	OperatingSystems os;
	
	public Computer(String OsName) {
		if (OsName.equalsIgnoreCase("KaliLinux")) {
			os = new KaliLinux();
		} else if (OsName.equalsIgnoreCase("Ubuntu")) {
			os = new Ubuntu();
		} else if (OsName.equalsIgnoreCase("Microsoft")) {
			os = new Microsoft();
		} else if (OsName.equalsIgnoreCase("MacOS")) {
			os = new MacOs();
		}
	}

	@Override
	public void toRun(String OsName, String name) {
		
		if (OsName.equalsIgnoreCase("KaliLinux")) {
			os.runningKaliLinux(name);
		} else if (OsName.equalsIgnoreCase("Ubuntu")) {
			os.runningUbuntu(name);
		} else if (OsName.equalsIgnoreCase("Microsoft")) {
			os.runningMicrosoft(name);
		} else if (OsName.equalsIgnoreCase("MacOS")) {
			os.runningMacOS(name);
			
		}
		
		
	}

}
