import java.util.Collection;

/**
 * Created by d.zharenkov on 07.02.2018.
 */
public class CombinedEventLogger implements EventLogger {
    private final Collection<EventLogger> loggers;
    public CombinedEventLogger(Collection<EventLogger> loggers) {
        super();
        this.loggers = loggers;
    }

    @Override
    public void logEvent(Event event) {
        for (EventLogger eventLogger : loggers) {
            eventLogger.logEvent(event);
        }
    }
}
