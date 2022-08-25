import java.util.List;

public class Presenter {
    View view;
    Model model;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void StartChatting(){
        String text = view.getMessageText("Enter the text of message, please love: ");
        model.createMessage(text);
        System.out.println(model.sendMessage());
    }

    public void ShowHistory(){
        int count = 1;
        for (Object list: model.seeHistory()) {
            System.out.println(list);
            count++;
            if (count % 2 != 0){
                System.out.println("----------------");
            }
        }
    }
}
