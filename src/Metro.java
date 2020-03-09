public class Metro extends PassengerTrain {
    public int railsCount = 2;
    public int railsDistance = 1520;
    public boolean isElectricRails = true;

   // Locomotives.add("Diesel")

    @Override
    public void beep() {
        System.out.println("Tuuuuu");
    }


}

