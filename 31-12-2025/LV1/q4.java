

public class q4 {
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice = 191;

        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;
        System.out.println("The Cost price is INR " + costPrice + " and Selling price is INR " + sellingPrice + "\n"+ "The Profit is INR " + profit + "and The Profit Percentage is " + profitPercentage + "%");
    }
}
