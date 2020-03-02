public abstract class Train {
    private String id, model;
    private int maxPassCountInCar;
    private int trainCarCount;
    private int maxPassCount;

   // abstract void Run();


    public class Locomotive {
        String[] engineType = {"Steam", "Diesel", "Electric"};
        int locomotiveCount = 2;
    }
    public class TrainCar {
        int trainCarCount = 5;
        String trainCarType;
    }

    public int getMaxPassCount () {
        return maxPassCountInCar = maxPassCountInCar * trainCarCount;
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

    public void trainCarry() {
        System.out.println("chuh chuh");
    }
    public void trainStop() {

        System.out.println("stop");
    }

}
