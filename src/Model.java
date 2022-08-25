import java.util.List;

public interface Model {
    boolean createMessage(String text);
    boolean sendMessage();
    List seeHistory();
}
