package jp.co.aforce.servlet;

public class UserInfo {
	private String fullName;
    private boolean isAdmin;

    public UserInfo(String fullName, boolean isAdmin) {
        this.fullName = fullName;
        this.isAdmin = isAdmin;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
