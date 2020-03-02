public class Rails {
    private int railsLength;
    public String railsType;

    public String getRailsType(int railsCount, int railsDistance, boolean isElectricRails) {
        if (railsCount == 1) {
            railsType = "monorail";
        } else {
            railsType = "double rail";
        }
        if (railsDistance < 1520) {
            railsType += " narrow-guage";
        } else {
            railsType += " standard";
        }
        railsType += isElectricRails ? " electric rails" : " rails";

        return railsType;
    }

    public void setRailsType (String railsType) {
        this.railsType = railsType;
    }
}
