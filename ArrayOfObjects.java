// 11. ,  13	Write a JAVA Program to implement an array of objects of a class.



class Product {
    int pid;
    String pname;

    // Product class constructor  
    Product(int pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }

    public void display() {
        System.out.println("ProductId=" + pid + " Product Name = " + pname);
    }
}

public class ArrayOfObjects {
    public static void main(String args[]) {
        // create an array of product object
        Product[] products = new Product[5];
        // create & initialize actual product productsects using constructor
        products[0] = new Product(23907, "Dell Laptop");
        products[1] = new Product(91240, "HP 630");
        products[2] = new Product(29823, "LG OLED TV");
        products[3] = new Product(11908, "MI Note Pro Max 9");
        products[4] = new Product(43590, "Kingston USB");
        for (int i = 0; i < products.length; i++) {
            System.out.println("Product Object: " + (i + 1));
            products[i].display();
        }

    }
}

/*
 * Product Object: 2
 * ProductId=91240 Product Name = HP 630
 * Product Object: 3
 * ProductId=29823 Product Name = LG OLED TV
 * Product Object: 4
 * ProductId=11908 Product Name = MI Note Pro Max 9
 * Product Object: 5
 * ProductId=43590 Product Name = Kingston USB
 * 
 */