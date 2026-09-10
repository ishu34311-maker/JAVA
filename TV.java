public class TV {
    public static void main(String[] args) {

        //Led led = new Led("Samsung", "Black");
        //Led led2 = new Led("Google", "Yellow");



        Led[] leds ={new Led("Tcl", "Black"),
                     new Led("Lg", "Grey")
        };

        for(Led led : leds){
            led.color = "Red";
        }
        for(Led led : leds){
            led.on();
        }

        //for(int i =0; i<leds.length; i++){
        //  leds[i].on();
        //}
       
    }
}

class Led{

    String model;
    String color;

    Led(String model, String color){
        this.model = model;
        this.color = color;

    }

    void on(){
        System.out.println("You turn on the " + color + " " + model);
    }

}
