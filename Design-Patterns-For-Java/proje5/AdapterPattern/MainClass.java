package proje5.AdapterPattern;

public class MainClass {

	public static void main(String[] args) {
		
		Laptop laptop=new Laptop();
		laptop.toRun("Mint", "Mint");
		laptop.toRun("Microsoft", "Microsoft 10");
		laptop.toRun("KaliLinUx", "KaliLinux 4.2");
		laptop.toRun("MAcOS", "MacOS X");
		laptop.toRun("UbUntu", "UbuntU 16.1");

		
		// output : 
		
		/*
		Running Operating System's Name : Mint
		Running Operating System's Name : Microsoft 10
		Running Operating System's Name : KaliLinux 4.2
		Running Operating System's Name : MacOS X
		Running Operating System's Name : UbuntU 16.1
		 */	
		}

}
