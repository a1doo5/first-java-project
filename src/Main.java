public class Main {
    public static void main(String[] args) {
        String product = "Coffee";
        int quantity = 3;
        double price = 1250.0;
        double discountPercent = 10.0;

        double totalPrice = quantity * price;
        double discount = totalPrice * discountPercent / 100;
        double finalPrice = totalPrice - discount;

        System.out.println("Product: " + product);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price without discount: " + totalPrice);
        System.out.println("Discount: " + discount);
        System.out.println("Final price: " + finalPrice);
    }
}