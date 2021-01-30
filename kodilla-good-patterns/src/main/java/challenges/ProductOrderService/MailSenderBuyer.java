package challenges.ProductOrderService;

public class MailSenderBuyer implements Mail {


    @Override
    public void sendMail(UserBuyer userBuyer, Auction auction) {
        System.out.println("Congratulations " + userBuyer.getNickname() + "!");
        System.out.println("You bought: " + auction.getProduct().getName() + " for" +
                auction.getPrice() + " zł (ID: " + auction.getAuctionNumber() + ")");
    }

/*    public void sendMailToBuyerNOK (Auction auction, UserBuyer userBuyer) {
        System.out.println("Sorry, the product you wanted: " + auction.getProduct().getName() +
                "(ID: " + auction.getAuctionNumber() + ") has been already sold. You were late!");
    }*/

}
