package projectmarket.products;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
    private File importFile;
    private ArrayList<Integer> selectedProduct;
    private Integer selectedMerchantId;

    public void showProductByMerchantId(Integer merchantId) throws Exception {
        selectedMerchantId = merchantId;
        importFile = new File(merchantId + "_product.txt");
        Scanner scanner = new Scanner(importFile);
        System.out.println("Product ID, productName, unit Price, available, unit");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }

    public ArrayList<Integer> selectProducts() throws Exception {
        System.out.println("Enter a number to select a Product by 'Product ID'/press a letter to skip");
        selectedProduct = new ArrayList<Integer>();
        Scanner scannerConsole = new Scanner(System.in);
        while (scannerConsole.hasNextInt()) {
            selectedProduct.add(scannerConsole.nextInt());
        }
        return selectedProduct;
    }

    public static String[] getProductData(Integer productId, Integer selectedMerchantId) throws Exception {
        String[] productData;
        File importFile = new File(selectedMerchantId + "_product.txt");
        Scanner scanner = new Scanner(importFile);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            productData = line.split(",");
            if (new Integer(productData[0]).compareTo(productId)==0) {
                return productData;
            }
        }
        return null;
    }
}
