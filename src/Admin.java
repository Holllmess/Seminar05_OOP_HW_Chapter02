public class Admin extends BaseUser{

    private AdminStatus adminStatus;

    public Admin(String username, BaseUserStatus userStatus, AdminStatus adminStatus) {
        super(username, userStatus);
        this.adminStatus = adminStatus;
    }
}
