import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //задаем число пассажиров, которое нужно перевезти
        int passCount = 200;
        int cargoWeight = 1500;

        String name = "Exhibit number one";

        //создаем экземпляр класса одного из поездов
        SteamTrain myTrain = new SteamTrain();
        System.out.println(myTrain.getMaxPassCount());
        myTrain.getMaxPassCount();

        // собираем поезд из локомотива и вагонов
        ArrayList<String> locomotives = new ArrayList<>(); //пусть ради разнообразия локомотавы могут быть разных типов
        locomotives.add("Diesel");
        locomotives.add("Diesel");
        Train.TrainCar car = new Train.TrainCar(6, "green");
        System.out.println("Train with " + locomotives.size() + " locomotives and " + car.getTrainCarCount() + " " + car.getTrainCarType() + " cars");

        //определяем, по каким рельсам поедет поезд
        Rails myRails = new Rails();
        myRails.getRailsType(myTrain.railsCount, myTrain.railsDistance, myTrain.isElectricRails);

        //определяем, является ли поезд пассажирским
        if (myTrain.isCarriesPass()) {
            myTrain.carryPass(passCount, myTrain.getMaxPassCount()); //может ли ехать
        } else if (myTrain.isCarriesCargo()) { //если грузовой,
            myTrain.carryCargo(cargoWeight); //везем груз
        } else { //если музейный, то демонстрируем его
            myTrain.demonstration(name);

        }

        //до какой станции едем?
        Station myStation = new Station();
        myStation.setStationName("Perebor");

        //просто сигналим
        myTrain.beep();



    }
}
