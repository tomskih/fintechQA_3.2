public class Main {
    public static void main(String[] args) {
        //задаем число пассажиров, которое нужно перевезти
        int passCount = 200;

        //параметры рельсов, чтобы определить тип дороги
        int railsCount = 1;
        int railsDistance = 1520;
        boolean isElectricRails = false;

        //создаем экземпляр класса Monorail
        Monorail myMonorail = new Monorail();
        myMonorail.getMaxPassCount();

        myMonorail.carryPass(passCount, myMonorail.getMaxPassCount());


        String MyRails = new Rails().getRailsType (railsCount, railsDistance, isElectricRails);

        myMonorail.beep();

    }
}
