package e_commerce_search_function;

import java.util.*;

public class Product_BinarySearch implements Comparable<Product_BinarySearch> {
    int id;
    String name;
    String category;

    public Product_BinarySearch(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public int compareTo(Product_BinarySearch ele) {
        return Integer.compare(this.id, ele.id);
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", category=" + category;
    }

    public static void addProduct(List<Product_BinarySearch> li, int id, String name, String category) {
        li.add(new Product_BinarySearch(id, name, category));
    }

    public static void searchProductById(List<Product_BinarySearch> li, int id) {
        li.sort(null); 

        int low = 0, high = li.size() - 1;
        int flag = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midId = li.get(mid).id;

            if (midId == id) {
                System.out.println("Product found: " + li.get(mid));
                flag++;
                break;
            } else if (midId > id) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (flag == 0) {
            System.out.println("Product with ID " + id + " not found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product_BinarySearch> li = new ArrayList<>();

        while (true) {
            System.out.println("\nEnter 1 to add");
            System.out.println("Enter 2 to search");
            System.out.println("Enter 3 to exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("How many products do you want to add? ");
                    int count = sc.nextInt();
                    for (int i = 0; i < count; i++) {
                        System.out.println("Enter the id, name, and category:");
                        int id = sc.nextInt();
                        String name = sc.next();
                        String category = sc.next();
                        addProduct(li, id, name, category);
                    }
                    System.out.println("Current Product List:");
                    for (Product_BinarySearch p : li) {
                        System.out.println(p);
                    }
                    break;

                case 2:
                    System.out.println("Enter product id to be searched:");
                    int sid = sc.nextInt();
                    searchProductById(li, sid);
                    break;

                case 3:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
