package challenges.ProductOrderService;

public class Processor {

    private Mail mail;
    private Sales sales;

    public Processor(Mail mail, Sales sales) {
        this.mail = mail;
        this.sales = sales;
    }


    public void auctionProcessor(Auction auction) {

        sales.createTransaction(auction.getUserBuyer(), auction);
        mail.sendMail(auction.getUserBuyer(), auction);

    }
}
