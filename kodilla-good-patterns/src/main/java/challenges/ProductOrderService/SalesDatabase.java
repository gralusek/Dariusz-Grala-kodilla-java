package challenges.ProductOrderService;

public class SalesDatabase implements Sales{


    @Override
    public void createTransaction(UserBuyer userBuyer, Auction auction) {
        System.out.println("New transaction in database");
        System.out.println("User: " + userBuyer.getNickname() + " (ID: " + userBuyer.getUserID() + ")");
        System.out.println("Succesfully bought: " + auction.getProduct().getName()
                            + " for: " + auction.getPrice() + " zł");
        System.out.println("On auction ID " + auction.getAuctionNumber());
    }
}
