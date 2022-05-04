class Wheel {
    private String manufacturer;     
}
  
final class Car {
    private final Wheel Wheel; // Composition
         
    Car(Wheel wheel) {
        this.wheel = wheel;
    }
    
    public void move() {          
         System.out.println("Car works");
        }
    }
}
