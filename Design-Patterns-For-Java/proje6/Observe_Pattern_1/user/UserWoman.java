package designPattern.observe1.user;

import designPattern.observe1.Observable;

public class UserWoman implements Observer{
    private Observable observable;
    private String name;
    public UserWoman( String name) {
		this.name = name;
	}
    public UserWoman() {
    }

    public void setObservable(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void notify(String message) {
        System.out.println(message + " UserWoman Mesaj Geldi."+this.name);
    }

    public void removeObserver(){
    	System.out.println("Deleted "+this.name);
        observable.removeObserver(this);
    }
}
