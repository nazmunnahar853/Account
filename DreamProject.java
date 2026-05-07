class Dress {
    String Zara;
    String color;

    Dress(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
    }

    
}

public class DreamProject{
public static void main(String[] args) {
        Dress d1 = new Dress("Zara", "Red");
        d1.showDetails();
    }
}