package challenges.ProductOrderService;

public class ProductOrderService {

    public static void main(String[] args) {

        AuctionRetriever auctionRetriever = new AuctionRetriever();
        Auction auction = auctionRetriever.retrieve();

        Processor processor = new Processor(new MailSenderBuyer(),new SalesDatabase());

        processor.auctionProcessor(auction);
    }
}
