package com.boogastudio.another;

public class OrikaMapTo {

    private int travelDuration;
    private boolean sourcePlace;
    private boolean destinationPlace;

    public OrikaMapTo() {
    }

    public OrikaMapTo(int travelDuration, boolean sourcePlace, boolean destinationPlace) {
        this.travelDuration = travelDuration;
        this.sourcePlace = sourcePlace;
        this.destinationPlace = destinationPlace;
    }

    public void setTravelDuration(int travelDuration) {
        this.travelDuration = travelDuration;
    }

    public int getTravelDuration() {
        return travelDuration;
    }

    public boolean getSourcePlace() {
        return sourcePlace;
    }

    public void setSourcePlace(boolean sourcePlace) {
        this.sourcePlace = sourcePlace;
    }

    public boolean getDestinationPlace() {
        return destinationPlace;
    }

    public void setDestinationPlace(boolean destinationPlace) {
        this.destinationPlace = destinationPlace;
    }
}
