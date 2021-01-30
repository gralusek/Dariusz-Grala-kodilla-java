package challenges.ProductOrderService;

public class UserSeller {

    private String nickname;
    private int userID;

    public UserSeller(String nickname, int userID) {
        this.nickname = nickname;
        this.userID = userID;
    }

    public String getNickname() {
        return nickname;
    }

    public int getUserID() {
        return userID;
    }
}
