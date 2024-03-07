package storeProducts;

public class storeProduct {
	
	

	public static void main(String[] args) {
	 product product1 = new product(); 
	 product product2 = new product(); 
	 product product3 = new product();
	 data_Getter(product1, product2, product3);
	 compare(product1, product2, product3);
	 
	 

	}
	
	static void data_Getter(product first, product second, product third) {
		first.memberspcode = 1234;
		first.pname= "milk";
		first.price = 30;
		
		second.memberspcode = 1235;
		second.pname= "curd";
		second.price = 40;
		
		third.memberspcode = 1236;
		third.pname= "yogurt";
		third.price = 60;
		
	}
	
	 static void compare(product first, product second, product third) {
		 if(first.price>second.price) {
			 if(first.price>third.price) {
				 System.out.println(first.pname +" Has higher price");
			 }
			 else{
				 System.out.println(third.pname +" Has higher price");
			 }
		 }
		 
		 else {
			 if(second.price>third.price) {
				 System.out.println(second.pname +" Has higher price");
			 }
			 else{
				 System.out.println(third.pname +" Has higher price");
			 }
		 }
		 
	 }
	

}
class product{
	int memberspcode;
	String pname;
	float price;
	
}
