package ss12.baitap.product;

public class Product {
    private  int code;
    private String productName;
    private double price;

    public Product() {
    }

    public Product(int code, String name, double price) {
        this.code = code;
        this.productName = name;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
