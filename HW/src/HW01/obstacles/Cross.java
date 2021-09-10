package HW01.obstacles;

import HW01.Competitors.Animal;
import HW01.Competitors.Competitor;

public class Cross extends Obstacle {
    private int distance;

    public Cross(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(distance);
    }
}
