package foo;


import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private static final String FILE_PATH = "products.bin";

    public static void main(String[] args) {
        List<Product> productList = loadProductsFromFile();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Display product list");
            System.out.println("2. Add new product");
            System.out.println("3. Exit");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        displayProductList(productList);
                        break;
                    case 2:
                        addNewProduct(productList, scanner);
                        break;
                    case 3:
                        saveProductsToFile(productList);
                        System.out.println("Exiting program...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    private static List<Product> loadProductsFromFile() {
        List<Product> productList = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            productList = (List<Product>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Failed to load products from file. Starting with an empty list.");
        }
        return productList;
    }

    private static void saveProductsToFile(List<Product> productList) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            outputStream.writeObject(productList);
        } catch (IOException e) {
            System.out.println("Failed to save products to file.");
        }
    }

    private static void displayProductList(List<Product> productList) {
        System.out.println("Product list:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    private static void addNewProduct(List<Product> productList, Scanner scanner) {
        int id = productList.isEmpty() ? 1 : productList.get(productList.size() - 1).getId() + 1;

        System.out.println("Enter product name:");
        String name = scanner.nextLine();

        System.out.println("Enter product price:");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter expiry date (yyyy-mm-dd):");
        LocalDate expiryDate = LocalDate.parse(scanner.nextLine());

        Product newProduct = new Product(id, name, price, expiryDate);
        try {
            validateNewProduct(productList, newProduct);
            productList.add(newProduct);
            System.out.println("New product added successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validateNewProduct(List<Product> productList, Product newProduct) throws IllegalArgumentException {
        if (newProduct.getExpiryDate().isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Expiry date should be greater than today's date.");
        }

        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(newProduct.getName()) && product.getPrice() == newProduct.getPrice()) {
                throw new IllegalArgumentException("A product with the same name and price already exists.");
            }
        }
    }
}