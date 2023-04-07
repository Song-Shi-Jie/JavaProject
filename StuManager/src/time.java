import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class time {
    public static void main(String[] args) {

        Runnable r1 = new Runnable() {

            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                        Date d = new Date();
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        System.out.println(sdf.format(d));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        // List<Integer> res = new ArrayList<>();
        Thread t = new Thread(r1);
        t.start();
    }
}
