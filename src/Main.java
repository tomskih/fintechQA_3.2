public class Main {
    public static void main(String[] args) {
        int passCount = 500;

        int railsCount = 1;
        int railsDistance = 1520;
        boolean isElectricRails = false;

        Monorail myMonorail = new Monorail();


        String MyRails = new Rails().getRailsType (railsCount, railsDistance, isElectricRails);

        System.out.println(MyRails);
    }
}
