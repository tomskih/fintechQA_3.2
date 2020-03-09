import java.util.ArrayList;

public abstract class Train implements Beeping, Carring{
    private String id, model;
    public int maxPassCountInCar = 100;
    public int trainCarCount;
    private int maxPassCount;
    public int cargoWeight;
    public String beepType = "Tu-tu";
    public Rails rails;

    // abstract void Run();


    public static class Locomotive {    //внутренний класс - локомотив
        private String engineType; // {"Steam", "Diesel", "Electric"};

        public String getEngineType() {
            return engineType;
        }

        public Locomotive (String engineType){
            this.engineType = engineType;
        }

    }
    public static class TrainCar {  //внутренний класс - вагон
        private int trainCarCount;
        private String trainCarType;

        public int getTrainCarCount() {
            return trainCarCount;
        }

        public void setTrainCarCount(int trainCarCount) {
            this.trainCarCount = trainCarCount;
        }

        public String getTrainCarType() {
            return trainCarType;
        }

        public void setTrainCarType(String trainCarType) {
            this.trainCarType = trainCarType;
        }


        public TrainCar(int trainCarCount,String trainCarType){
            this.trainCarCount = trainCarCount;
            this.trainCarType = trainCarType;
        }
    }

    public int getMaxPassCount () {
        System.out.println("trainCarCount = " + trainCarCount + ", maxPassCount1 = " + maxPassCount);
        return maxPassCount = maxPassCountInCar * trainCarCount;

    }
    public void carryPass(int passCount, int maxPassCount) {
        if (passCount <= maxPassCount){
            trainCarry();
            System.out.println("passCount = " + passCount + ", maxPassCount = " + maxPassCount);
        } else {
            trainStop();
            System.out.println("passCount = " + passCount + ", maxPassCount = " + maxPassCount);
        }
    }


    public void carryCargo(int cargoWeight){
        System.out.println("Cargo weight = " + cargoWeight);
    }

    public void trainCarry() {
        System.out.println("chuh chuh");
    }
    public void trainStop() {
        System.out.println("stop");
    }

    @Override
    public void beep() {
        System.out.println("Tu-tu");
    }
}
