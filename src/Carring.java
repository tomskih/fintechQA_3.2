public interface Carring {
    boolean isCarriesPass();
    boolean isCarriesCargo();

    void carryPass(int passCount, int maxPassCount);
    void carryCargo(int cargoWeight);

    void trainStop();
    void trainCarry();
}
