class Wheel {
    private String manufacturer;     
}

class Brand {
    private String name;
}
  
final class Car {
    private final Wheel wheel; // Composición
    private Brand brand; // Agregación
         
    Car(Wheel wheel, Brand brand) {
        this.wheel = wheel;
        this.brand = brand;
    }
}
