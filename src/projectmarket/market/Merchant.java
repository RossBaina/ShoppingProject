package projectmarket.market;
import java.util.Scanner;
import java.io.File;

public class Merchant {
    File importFile;
    Scanner scanner;
    public Integer selectedMerchant;
    public String merchant;
    public void showMerchants ()throws Exception {
        importFile = new File ("Merchant.txt" );
        scanner = new Scanner (importFile);
        System.out.println("Merchant ID, MerchantName, address, available, type, main office");
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }

    public Integer selectMerchant()throws Exception{
        System.out.println("Enter a number to select a Merchant by 'Merchant ID':");
        Scanner scannerConsole = new Scanner(System.in);
        selectedMerchant = scannerConsole.nextInt();
        return selectedMerchant;
    }

    public static String[] getMerchantData(Integer merchantId) throws Exception {
        String[] merchantData;
        File importFile = new File ("Merchant.txt" );
        Scanner scanner = new Scanner (importFile);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            merchantData = line.split(",");
            if (new Integer(merchantData[0]).compareTo(merchantId) == 0){
                return merchantData;
            }
        }
        return null;
    }

}
