package designPattern.observe1;

import java.util.ArrayList;
import java.util.List;

import designPattern.observe1.user.Observer;

public class NoticeObservable implements Observable  {

    private List<Observer> observerList = new ArrayList<>();
    private String message = "Notice... !";

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer); // Kullanýcýlarý duyuruya eklemek için.
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer); // Kullanýcýlarý duyurudan silmek için.
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.notify(message); // Duyuru ya kayýtlý kullanýcýlara mesaj göndermek için.
        }
    }
}
