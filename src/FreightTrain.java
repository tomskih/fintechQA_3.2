public class FreightTrain extends Train {
    public int railsCount = 2;
    public int railsDistance = 1520;
    public boolean isElectricRails = false;
    public int cargoWeight;

    @Override
    public boolean isCarriesPass(){
        return false;
    }

    @Override
    public void carryCargo(int cargoWeight){
        System.out.println("Cargo weight = " + cargoWeight);
    }
}
