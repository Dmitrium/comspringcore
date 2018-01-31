import java.util.Date;

/**
 * Created by d.zharenkov on 31.01.2018.
 */
public class Event {
    int id;
    String msg;
    Date date;

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + date +
                '}';
    }
}
