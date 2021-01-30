package challenges.ProductOrderService;

public class UserBuyer {

    private String nickname;
    private int userID;

    public UserBuyer(String nickname, int userID) {
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
