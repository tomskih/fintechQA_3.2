public class Tram extends PassengerTrain {
    public int railsCount = 2;
    public int railsDistance = 1520;
    public boolean isElectricRails = false;
    private int conductor;

    @Override
    public void beep() {
        System.out.println("Clang-clang");
    }
}
