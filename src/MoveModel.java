import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class MoveModel implements Model {

    private String tx;
    private List history;

    public MoveModel(){
        history = new ArrayList<>();
    }

    @Override
    public boolean createMessage(String text) {
        this.tx = text;
        return true;
    }

    @Override
    public boolean sendMessage() {
        Date date = new Date();
        this.history.add(date);
        this.history.add(tx);
        return true;
    }

    @Override
    public List seeHistory() {
        return getHistory();
    }

    public List getHistory() {
        return history;
    }
}
