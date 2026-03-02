import java.io.*;

class Product{
	int pid;
	String pname;

	Product(int pid,String pname) {
	   this.pid = pid;
	   this.pname = pname;
	}
	public void display(){
	   System.out.println("Product id="+pid+" Product Name="+pname);
	}
}


class ArrayOfObjects{
	

	public static void main(String args[]) {
		
		Product[] products = new Product[5];
		products[0] = new Product(23907,"Dell Laptop");
		products[1] = new Product(91240,"HP 630");
		products[2] = new Product(29823,"LG OLED TV");
		products[3] = new Product(11908,"Mi Note Pro Max 9");
		products[4] = new Product(43590,"Kingston USB");
		

		System.out.println("Program continues...");
		for(Product product:products) {
		   product.display();
		}
			
	}
}

/*
output:

 java ArrayOfObjects
Program continues...
Product id=23907 Product Name=Dell Laptop
Product id=91240 Product Name=HP 630
Product id=29823 Product Name=LG OLED TV
Product id=11908 Product Name=Mi Note Pro Max 9
Product id=43590 Product Name=Kingston USB
*/