package sorting_customer_orders;

public class Order {
	    int orderId;
	    String customerName;
	    double totalPrice;

	    public Order(int orderId, String customerName, double totalPrice) {
	        this.orderId = orderId;
	        this.customerName = customerName;
	        this.totalPrice = totalPrice;
	    }
  
	    
	    @Override
		public String toString() {
			return "orderId=" + orderId + ", customerName=" + customerName + ", totalPrice=" + totalPrice;
		}



		public static void bubbleSort(Order[] orders) {
	        int n = orders.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
	                    Order temp = orders[j];
	                    orders[j] = orders[j + 1];
	                    orders[j + 1] = temp;
	                }
	            }
	        }
	    }
	
		    public static void main(String[] args) {
		        Order[] orders = {
		            new Order(101, "Navya", 150.0),
		            new Order(102, "Kavya", 300.5),
		            new Order(103, "Bhavya", 120.75),
		            new Order(104, "Sravya", 550.25)
		        };

		        System.out.println("Original Orders:");
		        for (Order o : orders)
		        	{
		        	    System.out.println(o);
		        	}
		        bubbleSort(orders);
		        System.out.println("\nSorted by totalPrice using Bubble Sort :");
		        for (Order o : orders)
		        	{
		        	    System.out.println(o);
		        	}

		        
		

	}

}
