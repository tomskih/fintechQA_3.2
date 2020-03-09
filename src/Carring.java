public interface Carring {
    boolean isCarriesPass();
    void carryPass(int passCount, int maxPassCount);
    void carryCargo(int cargoWeight);
    void trainStop();
    void trainCarry();
}
