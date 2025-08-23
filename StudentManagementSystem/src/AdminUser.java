public class AdminUser extends User {
    @Override
    public void login(String username, String password) {
        System.out.println("Admin '" + username + "' logged in successfully.");
    }
}

