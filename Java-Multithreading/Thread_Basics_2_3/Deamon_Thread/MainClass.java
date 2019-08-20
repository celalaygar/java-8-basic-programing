package Thread_Basics_2_3.Deamon_Thread;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    static List<String> list = new ArrayList<String>();
    public static void main (String[] args) throws InterruptedException {

        MemoryWatcherThread.start();
        for (int i = 0; i < 100000; i++) {
            String str = new String("str"+i);
            list.add(str);
        }
      System.out.println("end of main method");
    }
}
