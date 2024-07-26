public class Stock {
    private String stockId;
    private int quantity;

    public Stock(String stockId, int quantity) {
        this.stockId = stockId;
        this.quantity = quantity;
    }

    public String  getStockId() {
        return stockId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void validateQuantity() {
        if (quantity < 5000) {
            throw new IllegalArgumentException("Quantity is below threshold (5000 units)");
        }
    }
    public static void main(String[] args) {
    
        Stock stock1 = new Stock("ABC123", 3000);
        Stock stock2 = new Stock("XYZ789", 6000);

        try {
            stock1.validateQuantity();
            System.out.println("Stock 1 validated successfully.");

            stock2.validateQuantity();
            System.out.println("Stock 2 validated successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    }
