public abstract class Train implements Beeping, Carring{
    private String id, model;
    public int maxPassCountInCar = 100;
    public int trainCarCount;
    private int maxPassCount;
    public int cargoWeight;
    public String beepType = "Tu-tu";
    public Rails rails;


    // abstract void Run();


    public static class Locomotive {
        private String[] engineType = {"Steam", "Diesel", "Electric"};
        public int locomotiveCount = 2;

        public String[] getEngineType() {
            return engineType;
        }
    }
    public static class TrainCar {
        int trainCarCount = 5;
        String trainCarType;
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
