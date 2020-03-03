package designPattern.observe1.user;

import designPattern.observe1.Observable;

public class UserMan implements Observer {
    private Observable observable;
    private String name;
    public UserMan( String name) {
		this.name = name;
	}
    @Override
    public void notify(String message) {
        System.out.println(message + " UserMan Mesaj Geldi."+this.name);
    }

    public void removeObserver(){
    	System.out.println("Deleted "+this.name);
        observable.removeObserver(this);
    }
}
