public class Rails {
    private String railsType;

    public String getRailsType(int railsCount, int railsDistance, boolean isElectricRails) {
        if (railsCount == 1) {
            railsType = "mono";
        } else {
            railsType = "double";
        }
        if (railsDistance != 0) {
            if (railsDistance < 1520) {
                railsType += " narrow-guage";
            } else {
                railsType += " standard";
            }
        }
        railsType += isElectricRails ? " electric rails" : " rails";

        return railsType;
    }

    public void setRailsType (String railsType) {
        this.railsType = railsType;
    }

}
