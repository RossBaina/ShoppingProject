package projectmarket.market;

import projectmarket.products.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Purchase {
    private ArrayList<Double> quantities;
    private ArrayList<PurchaseItem> itemList;
    private Double total = 0.0;

    public ArrayList<PurchaseItem> selectQuantities(ArrayList<Integer> products, String[] merchantData) throws Exception {
        Scanner scannerConsole;
        itemList = new ArrayList<PurchaseItem>();
        for (int i = 0; i < products.size(); i++) {
            PurchaseItem purchaseItem = new PurchaseItem();
            String[] productData = Product.getProductData(products.get(i), new Integer(merchantData[0]));
            purchaseItem.setProductName(productData[1]);
            purchaseItem.setMerchantAdress(merchantData[2]);
            purchaseItem.setUnit(productData[4]);
            purchaseItem.setUnitPrice(Double.parseDouble(productData[2]));

            System.out.println("Enter a quantity by 'Product ID':" + products.get(i));
            purchaseItem.showPurchaseItemRequestQuantity();
            scannerConsole = new Scanner(System.in);
            purchaseItem.setQuantity(scannerConsole.nextDouble());
            purchaseItem.setTotal(purchaseItem.getUnitPrice() * purchaseItem.getQuantity());
            itemList.add(purchaseItem);
        }
        return itemList;
    }

    public Double getTotal() {
        for (int i = 0; i < itemList.size(); i++) {
            total = total + itemList.get(i).getTotal();
        }
        return total;
    }

    public void showItems() {
        PurchaseItem.showHeaderPurchaseItem();
        for (int i = 0; i < itemList.size(); i++) {
            itemList.get(i).showPurchaseItem();
        }
        System.out.println("Order Total: "+getTotal()+"Bs");
    }

}
