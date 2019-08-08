package projectmarket.market;

import java.util.Scanner;

public class PurchaseItem {
    private String productName;
    private String merchantAdress;
    private Double unitPrice;
    private String unit;
    private Double quantity;
    private Double total;
   public void showPurchaseItemRequestQuantity(){
       System.out.println("ProductName, MerchantAddress, UnitPrice(Bs),unit");
       System.out.println(productName+", "+merchantAdress+", "+unitPrice+", "+unit);
   }
   public void showPurchaseItem(){
       System.out.println(productName+", "+merchantAdress+", "+unitPrice+", "+unit+", "+quantity+", "+total);
   }
   public static void showHeaderPurchaseItem(){
       System.out.println("ProductName, MerchantAddress, UnitPrice(Bs),unit, quantity, total");
   }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMerchantAdress() {
        return merchantAdress;
    }

    public void setMerchantAdress(String merchantAdress) {
        this.merchantAdress = merchantAdress;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
