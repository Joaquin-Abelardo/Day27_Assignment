package com.example.ecommerce_26;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class ProductController {

    public static class Product {
        private String id;
        private String name;
        private String brand;
        private double price;
        private String imageUrl;
        private String specs;

        public Product(String id, String name, String brand, double price, String imageUrl, String specs) {
            this.id = id;
            this.name = name;
            this.brand = brand;
            this.price = price;
            this.imageUrl = imageUrl;
            this.specs = specs;
        }

        public String getId() { return id; }
        public String getName() { return name; }
        public String getBrand() { return brand; }
        public double getPrice() { return price; }
        public String getImageUrl() { return imageUrl; }
        public String getSpecs() { return specs; }
    }

    private final List<Product> phoneList = List.of(
        new Product("p1", "iPhone 15 Pro", "Apple", 999.00, 
            "https://fdn2.gsmarena.com/vv/bigpic/apple-iphone-15-pro.jpg", 
            "6.1\" Super Retina XDR, A17 Pro chip"),
        new Product("p2", "Galaxy S23 Ultra", "Samsung", 1199.00, 
            "https://fdn2.gsmarena.com/vv/bigpic/samsung-galaxy-s23-ultra-5g.jpg", 
            "6.8\" Dynamic AMOLED 2X, Snapdragon 8 Gen 2"),
        new Product("p3", "Pixel 8 Pro", "Google", 999.00, 
            "https://fdn2.gsmarena.com/vv/bigpic/google-pixel-8-pro.jpg", 
            "6.7\" Super Actua LTDR, Google Tensor G3"),
        new Product("p4", "iPhone 14 Plus", "Apple", 799.00, 
            "https://fdn2.gsmarena.com/vv/bigpic/apple-iphone-14-plus.jpg", 
            "6.7\" Super Retina XDR, A15 Bionic"),
        new Product("p5", "OnePlus 11", "OnePlus", 699.00, 
            "https://fdn2.gsmarena.com/vv/bigpic/oneplus-11.jpg", 
            "6.7\" QHD+ AMOLED, Snapdragon 8 Gen 2"),
        new Product("p6", "Galaxy S23+", "Samsung", 999.00, 
            "https://fdn2.gsmarena.com/vv/bigpic/samsung-galaxy-s23-plus-5g.jpg", 
            "6.6\" Dynamic AMOLED 2X, Snapdragon 8 Gen 2"),
        new Product("p7", "Sony Xperia 1 V", "Sony", 1399.00, 
            "https://fdn2.gsmarena.com/vv/bigpic/sony-xperia-1-v.jpg", 
            "6.5\" 4K HDR OLED, Exmor T sensor"),
        new Product("p8", "ASUS ROG Phone 7", "ASUS", 999.00, 
            "https://fdn2.gsmarena.com/vv/bigpic/asus-rog-phone-7.jpg", 
            "6.78\" Samsung AMOLED 165Hz, AirTrigger")
    );

    @GetMapping("/products")
    public String viewProducts(Model model) {
        model.addAttribute("phones", phoneList);
        return "products"; 
    }
}