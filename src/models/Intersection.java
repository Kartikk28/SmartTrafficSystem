package models;

import java.util.ArrayList;
import java.util.List;
import models.TrafficLight;

public class Intersection {
    private List<TrafficLight> trafficLights; // List of traffic lights at the intersection

    public Intersection(int numLights) {
        trafficLights = new ArrayList<>();
        for (int i = 0; i < numLights; i++) {
            trafficLights.add(new TrafficLight());
        }
    }

    public void cycleAllLights() {
        for (TrafficLight light : trafficLights) {
            light.cycleLight();
        }
    }

    public List<String> getTrafficLightStates() {
        List<String> states = new ArrayList<>();
        for (TrafficLight light : trafficLights) {
            states.add(light.getColor());
        }
        return states;
    }

    public void displayIntersection() {
        System.out.println("Traffic Light States:");
        for (int i = 0; i < trafficLights.size(); i++) {
            System.out.println("Light " + (i + 1) + ": " + trafficLights.get(i).getColor());
        }
    }
}
