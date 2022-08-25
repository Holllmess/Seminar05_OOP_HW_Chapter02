public abstract class BaseUser {
    private String username;
    private BaseUserStatus userStatus;

    public BaseUser(String username, BaseUserStatus userStatus) {
        this.username = username;
        this.userStatus = userStatus;
    }

    public String getUsername() {
        return username;
    }

    public BaseUserStatus getUserStatus() {
        return userStatus;
    }
}
