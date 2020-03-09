public class ChildTrain extends PassengerTrain {
    public int railsCount = 2;
    public int railsDistance = 750;
    public boolean isElectricRails = false;

    private int childCount;
    private int turnCount;


    public int getChildCount() {
        return childCount;
    }

    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    public int getTurnCount() {
        return childCount;
    }

    public void setTurnCount(int turnCount) {
        this.turnCount = turnCount;
    }

    public int childInTurnCount(int childCount, int turnCount){
        return childCount/turnCount;
    }




}
