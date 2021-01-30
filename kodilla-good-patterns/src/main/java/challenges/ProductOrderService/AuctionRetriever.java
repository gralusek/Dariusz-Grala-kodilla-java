package challenges.ProductOrderService;

public class AuctionRetriever {

    public Auction retrieve() {
        UserBuyer userBuyer = new UserBuyer("lolek", 8574633);
        UserSeller userSeller = new UserSeller("bolek", 3336843);
        Product product = new Product("Motorbike", "Viehelce");
        Auction auction = new Auction(userBuyer, product, 3400.00, 1, 9674354);

        return auction;
    }
}
