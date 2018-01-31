import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    Client client;

    public App(Client client, ConsoleEventLogger eventlogger) {
        this.client = client;
        this.eventlogger = eventlogger;
    }

    ConsoleEventLogger eventlogger;
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App)ctx.getBean("app");
        app.logEvent("Some event for user 1");
        app.logEvent("Some event for user 2");
    }

    private void logEvent(String msg){
        String message = msg.replaceAll(client.getId(), client.getFullname());
        eventlogger.logEvent(message);
    }

}
