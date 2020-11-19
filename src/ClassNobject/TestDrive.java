package ClassNobject;

public class TestDrive {

    public static void main(String[] args) {
        Car carex = new Car() {
            public void start() {
                System.out.println("Start the car with the press of a button");
            }
            public void stop() {
                System.out.println("Park the car and shut it down");
            }
        };
        carex.start();
        carex.stop();

        String st = "mango";
        System.out.println(st);
        int value = 1;
        System.out.println(value);

        Engine engineex = (num1, num2) -> {
            //lambda expression^ coming from engine interface
            System.out.println(num1 * num2);
        };
        engineex.fly(10,12);

        Vehicle vehicleex = () ->{
            System.out.println("Turn the car on to move it");
        };
        vehicleex.move();

        RideSharing rideSharingEx = (ride) ->System.out.println(ride);
        rideSharingEx.rideOnDemand("Ride with Uber");
        //single line setup

        }
    }

