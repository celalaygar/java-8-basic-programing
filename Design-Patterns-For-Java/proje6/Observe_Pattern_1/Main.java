package designPattern.observe1;

import designPattern.observe1.user.UserMan;
import designPattern.observe1.user.UserWoman;

public class Main {

	public static void main(String[] args) {
        UserMan userMan = new UserMan("MAN-1");
        UserWoman userWoman1 = new UserWoman("WOMAN-1");
        UserWoman userWoman2 = new UserWoman("WOMAN-2");
        UserWoman userWoman3 = new UserWoman("WOMAN-3");

        NoticeObservable noticeObservable = new NoticeObservable();


        noticeObservable.addObserver(userMan);
        noticeObservable.addObserver(userWoman1);
        noticeObservable.addObserver(userWoman2);
        noticeObservable.addObserver(userWoman3);
        noticeObservable.notifyObserver();

        userWoman1.setObservable(noticeObservable);
        userWoman1.removeObserver();
        userWoman2.setObservable(noticeObservable);
        userWoman2.removeObserver();
        noticeObservable.notifyObserver();
        
//		output : 
//        Notice... ! UserMan Mesaj Geldi.MAN-1
//        Notice... ! UserWoman Mesaj Geldi.WOMAN-1
//        Notice... ! UserWoman Mesaj Geldi.WOMAN-2
//        Notice... ! UserWoman Mesaj Geldi.WOMAN-3
//        Deleted WOMAN-1
//        Deleted WOMAN-2
//        Notice... ! UserMan Mesaj Geldi.MAN-1
//        Notice... ! UserWoman Mesaj Geldi.WOMAN-3
        
	}

}
