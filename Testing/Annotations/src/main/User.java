public class User {
    String username ;
    String password ;
    Boolean voted;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.voted = false;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Boolean hasVoted() {
        return voted;
    }
    public void setVoted(Boolean voted) {
        this.voted = voted;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", voted=" + voted +
                '}';
    }
}

