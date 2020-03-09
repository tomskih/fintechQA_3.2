public class Monorail extends PassengerTrain {
    public int maxPassCountInCar = 200;
    static int trainCarCount = 6;
    public int railsCount = 1;
    public int railsDistance = 0;
    public boolean isElectricRails = false;


    @Override
    public void beep() {
        System.out.println("Clang-clang");
    }




}
