package projectmarket;

import projectmarket.market.Merchant;
import projectmarket.market.Purchase;
import projectmarket.products.Product;

import java.util.ArrayList;
import java.util.Scanner;


public class BuyAtHome {
    public static void main(String[] args){
        System.out.println("Welcome to 'GROCERY SHOPPING LIST'");
        Scanner programScanner = new Scanner(System.in);
        System.out.println("Press enter numbers only in the options as product ID and Merchant Id");
        System.out.println("Do you want to place an Order (Y/N)?");
        String option = programScanner.nextLine();
        while(option.equalsIgnoreCase("Y")) {

            Merchant merchant = new Merchant();
            Product product = new Product();
            Purchase purchase = new Purchase();
            try {
                merchant.showMerchants();
                Integer merchantId = merchant.selectMerchant();
                product.showProductByMerchantId(merchantId);
                ArrayList<Integer> productsSelected = product.selectProducts();
                String[] partialMerchant = Merchant.getMerchantData(merchantId);
                purchase.selectQuantities(productsSelected, partialMerchant);
                purchase.showItems();
                System.out.println("ORDER COMPLETED!");
            } catch (Exception e) {
                System.out.println("Error in application " + e.getStackTrace());
            }
            System.out.println("Do you want to continue ordering (Y/N)?");
            option = programScanner.nextLine();
        }

        System.out.println("BYE!!!");
    }

    private static void ShowMenu(){

    }
}
