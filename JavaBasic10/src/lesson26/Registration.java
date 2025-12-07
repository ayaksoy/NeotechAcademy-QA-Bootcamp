package lesson26;

public class Registration {
    private String email;
    private String password;
    private String userName;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@yahoo.com") && email.length() > 10)
            this.email = email;
        else
            System.out.println("Valid email consider to be only yahoo!");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (userName.isEmpty())
            System.out.println("First you have to set an userName");
        else if (password.length() > 6 && !password.contains(userName))
            this.password = password;
        else
            System.out.println("Password length should be more than 6 and should not contain userName");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName.length() > 6)
            this.userName = userName;
        System.out.println("userName length should be greater than 6");
    }
}
