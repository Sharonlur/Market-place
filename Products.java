import java.util.ArrayList;
import java.util.Scanner;

public class Products {

    private ArrayList<ReportData> products;
    private Scanner scanner;

    public Products() {
        products = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void DisplayMenu() {

        int choice;

        do {
            System.out.println("\n===== EXTREME IT PRODUCTS =====");
            System.out.println("1. Capture a new product");
            System.out.println("2. Search for a product");
            System.out.println("3. Delete a product");
            System.out.println("4. Update a product");
            System.out.println("5. View product report");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    CaptureProduct();
                    break;

                case 2:
                    SearchProduct();
                    break;

                case 3:
                    DeleteProduct();
                    break;

                case 4:
                    UpdateProduct();
                    break;

                case 5:
                    DisplayReport();
                    break;

                case 6:
                    ExitApplication();
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (choice != 6);
    }

    public void CaptureProduct() {

        ReportData product = new ReportData();

        System.out.println("\n===== CAPTURE PRODUCT =====");

        System.out.print("Enter product code: ");
        product.setProductCode(scanner.nextLine());

        System.out.print("Enter product name: ");
        product.setProductName(scanner.nextLine());

        product.setCategory(CaptureCategory());

        System.out.print("Enter product price: ");
        product.setPrice(scanner.nextDouble());

        System.out.print("Enter stock level: ");
        product.setStock(scanner.nextInt());
        scanner.nextLine();

        System.out.println("\nWarranty Options");
        System.out.println("1. Six-month warranty");
        System.out.println("Any other key. Two-year warranty");
        System.out.print("Select warranty: ");

        String warrantyChoice = scanner.nextLine();

        if (warrantyChoice.equals("1")) {
            product.setWarranty("Six-month warranty");
        } else {
            product.setWarranty("Two-year warranty");
        }

        products.add(product);

        System.out.println("\nProduct details have been successfully saved.");
    }

    private String CaptureCategory() {

        while (true) {

            System.out.println("\nProduct Categories");
            System.out.println("1. Desktop Computer");
            System.out.println("2. Laptop");
            System.out.println("3. Tablet");
            System.out.println("4. Printer");
            System.out.println("5. Gaming Console");

            System.out.print("Select category: ");

            String choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    return "Desktop Computer";

                case "2":
                    return "Laptop";

                case "3":
                    return "Tablet";

                case "4":
                    return "Printer";

                case "5":
                    return "Gaming Console";

                default:
                    System.out.println("Invalid category. Please enter a valid option.");
            }
        }
    }

    public void SearchProduct() {

        System.out.print("\nEnter product code: ");
        String code = scanner.nextLine();

        ReportData product = findProduct(code);

        if (product != null) {
            displayProduct(product);
        } else {
            System.out.println("Product cannot be located.");
        }
    }

    private ReportData findProduct(String code) {

        for (ReportData product : products) {

            if (product.getProductCode().equalsIgnoreCase(code)) {
                return product;
            }
        }

        return null;
    }

    private void displayProduct(ReportData product) {

        System.out.println("\n===== PRODUCT DETAILS =====");
        System.out.println("Product Code: " + product.getProductCode());
        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Category: " + product.getCategory());
        System.out.println("Price: R" + product.getPrice());
        System.out.println("Stock Level: " + product.getStock());
        System.out.println("Warranty: " + product.getWarranty());
    }

    public void DeleteProduct() {

        System.out.print("\nEnter product code to delete: ");
        String code = scanner.nextLine();

        ReportData product = findProduct(code);

        if (product == null) {
            System.out.println("Product cannot be located.");
            return;
        }

        displayProduct(product);

        System.out.print("\nAre you sure you want to delete this product? (Y/N): ");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("Y")) {

            products.remove(product);

            System.out.println("Product has been deleted successfully.");

        } else {

            System.out.println("Product was not deleted.");
        }
    }

    public void UpdateProduct() {

        System.out.print("\nEnter product code to update: ");
        String code = scanner.nextLine();

        ReportData product = findProduct(code);

        if (product == null) {
            System.out.println("Product cannot be located.");
            return;
        }

        displayProduct(product);

        System.out.println("\n===== UPDATE PRODUCT =====");
        System.out.println("1. Update warranty");
        System.out.println("2. Update price");
        System.out.println("3. Update stock level");
        System.out.print("Select option: ");

        String choice = scanner.nextLine();

        switch (choice) {

            case "1":

                System.out.println("\n1. Six-month warranty");
                System.out.println("Any other key. Two-year warranty");
                System.out.print("Select warranty: ");

                String warranty = scanner.nextLine();

                if (warranty.equals("1")) {
                    product.setWarranty("Six-month warranty");
                } else {
                    product.setWarranty("Two-year warranty");
                }

                System.out.println("Warranty updated successfully.");
                break;

            case "2":

                System.out.print("Enter new price: ");
                double price = scanner.nextDouble();
                scanner.nextLine();

                product.setPrice(price);

                System.out.println("Price updated successfully.");
                break;

            case "3":

                System.out.print("Enter new stock level: ");
                int stock = scanner.nextInt();
                scanner.nextLine();

                product.setStock(stock);

                System.out.println("Stock level updated successfully.");
                break;

            default:
                System.out.println("Invalid update option.");
        }
    }

    public void DisplayReport() {

        System.out.println("\n========== PRODUCT REPORT ==========");

        if (products.isEmpty()) {
            System.out.println("No products have been captured.");
            return;
        }

        for (ReportData product : products) {

            System.out.println("-----------------------------------");
            System.out.println("Product Code : " + product.getProductCode());
            System.out.println("Product Name : " + product.getProductName());
            System.out.println("Category     : " + product.getCategory());
            System.out.println("Price        : R" + product.getPrice());
            System.out.println("Stock        : " + product.getStock());
            System.out.println("Warranty     : " + product.getWarranty());
        }

        System.out.println("-----------------------------------");
    }

    public void ExitApplication() {

        System.out.println("\nThank you for using Extreme IT Products.");
        System.out.println("Application closing...");
    }
}