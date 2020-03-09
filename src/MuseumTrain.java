public abstract class MuseumTrain extends Train{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean isCarriesPass(){
        return false;
    }

    @Override
    public boolean isCarriesCargo() {
        return false;
    }
    abstract void demonstration(String name);
}
