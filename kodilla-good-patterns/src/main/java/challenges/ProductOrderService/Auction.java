package challenges.ProductOrderService;

public class Auction {

    private UserBuyer userBuyer;
    private Product product;
    private double price;
    private int availablePieces;
    private int auctionNumber;

    public Auction(UserBuyer userBuyer, Product product, double price, int availablePieces, int auctionNumber) {
        this.userBuyer = userBuyer;
        this.product = product;
        this.price = price;
        this.availablePieces = availablePieces;
        this.auctionNumber = auctionNumber;
    }

    public UserBuyer getUserBuyer() {
        return userBuyer;
    }

    public Product getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailablePieces() {
        return availablePieces;
    }

    public int getAuctionNumber() {
        return auctionNumber;
    }
}
