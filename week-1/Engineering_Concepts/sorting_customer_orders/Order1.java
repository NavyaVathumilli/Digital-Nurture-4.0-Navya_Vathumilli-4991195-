package sorting_customer_orders;

public class Order1 {
	    int orderId;
	    String customerName;
	    double totalPrice;

	    public Order1(int orderId, String customerName, double totalPrice) {
	        this.orderId = orderId;
	        this.customerName = customerName;
	        this.totalPrice = totalPrice;
	    }
	    @Override
		public String toString() {
			return "Order [orderId=" + orderId + ", customerName=" + customerName + ", totalPrice=" + totalPrice + "]";
		}

	    public static void quickSort(Order1[] orders, int low, int high) {
	        if (low < high) {
	            int pi = partition(orders, low, high);
	            quickSort(orders, low, pi - 1);
	            quickSort(orders, pi + 1, high);
	        }
	    }

	    private static int partition(Order1[] orders, int low, int high) {
	        double pt = orders[high].orderId;
	        int i = (low - 1);
	        for (int j = low; j < high; j++) {
	            if (orders[j].orderId < pt) {
	                i++;
	                Order1 temp = orders[i];
	                orders[i] = orders[j];
	                orders[j] = temp;
	            }
	        }
	        Order1 temp = orders[i + 1];
	        orders[i + 1] = orders[high];
	        orders[high] = temp;

	        return i + 1;
	    }

		    public static void main(String[] args) {
		        Order1[] orders = {
		        		 new Order1(109, "Navya", 150.0),
				            new Order1(102, "Kavya", 300.5),
				            new Order1(105, "Bhavya", 120.75),
				            new Order1(104, "Sravya", 550.25)
		        };

		        System.out.println("Original Orders:");
		        for (Order1 o : orders)
		        	{
		        	   System.out.println(o);
		        	}
		        
		        quickSort(orders, 0, orders.length - 1);
		        System.out.println("\nSorted by orderId using Quick Sort:");
		        for (Order1 o : orders)
		        	{
		        	    System.out.println(o);
		        	}

		        
		    }
		}

