package model;

public class Heart {
    private boolean isBroken;

    public void toggle() {
        if (isBroken) {
            isBroken = false;
        } else {
            isBroken = true;
        }
    }

    public void toggle(boolean isBroken) {
        this.isBroken = isBroken;
    }

    public boolean isBroken() {
        return isBroken;
    }
}
