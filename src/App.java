public class App {
    public static void main(String[] args) {
        BaseUser user01 = new User("Mark", BaseUserStatus.PREMIUM);
        BaseUser user02 = new Admin("God", BaseUserStatus.PREMIUM, AdminStatus.SUPPORT);

        Presenter presenter = new Presenter(new View(), new MoveModel());
//        presenter.StartChatting();
//        presenter.StartChatting();

        presenter.ShowHistory();




    }
}
