public abstract class PassengerTrain extends Train {
    private boolean hasDiningCar = true;

    public boolean isHasDiningCar() {
        return hasDiningCar;
    }

    public void setHasDiningCar(boolean hasDiningCar) {
        this.hasDiningCar = hasDiningCar;
    }

    @Override
    public boolean isCarriesPass(){
        return true;
    }

    @Override
    public boolean isCarriesCargo() {
        return false;
    }
}
