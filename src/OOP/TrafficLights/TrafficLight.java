package OOP.TrafficLights;

public class TrafficLight {
    private Colours currentColour;

    public TrafficLight (Colours currentColour){
        this.currentColour = currentColour;
    }

    public Colours getCurrentColour(){
        return currentColour;
    }
}
