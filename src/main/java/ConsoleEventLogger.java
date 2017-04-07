/**
 * Created by Pixie on 07.04.2017.
 */
public class ConsoleEventLogger implements EventLogger{

    public void logEvent(String msg){
        System.out.println(msg);
    }
}
