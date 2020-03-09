import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //задаем число пассажиров, которое нужно перевезти
        int passCount = 200;

        //создаем экземпляр класса одного из поездов
        FreightTrain myTrain = new FreightTrain();
        System.out.println(myTrain.getMaxPassCount());
        myTrain.getMaxPassCount();

        // собираем поезд из локомотива и вагонов


        //определяем, по каким рельсам поедет поезд
        Rails myRails = new Rails();
        myRails.getRailsType(myTrain.railsCount, myTrain.railsDistance, myTrain.isElectricRails);
        System.out.println(myRails.railsType);

        //определяем, является ли поезд пассажирским и может ли ехать
        if (myTrain.isCarriesPass()) {
            myTrain.carryPass(passCount, myTrain.getMaxPassCount());
        }
        //просто сигналим
        myTrain.beep();



    }
}
