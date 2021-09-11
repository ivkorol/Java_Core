package HW.HW01;

import HW.HW01.Competitors.*;
import HW.HW01.obstacles.*;

public class Main {
    public static void main(String[] args) {

        Competitor[] competitors = {new Monkey("Чарли"), new Cat("Семен"), new Dog("Джек")};
        Obstacle[] obstacles = {new Cross(400), new Wall(2), new Water(1)};

        Team team = new Team("Winners", competitors);

        System.out.println("__________created new team__________");
        System.out.println(team.getTeamName());

        System.out.println("__________greeting team members__________");
        team.showResults();

        Course course = new Course(obstacles);

        System.out.println("__________team goes to course__________");
        course.doIt(team);

        System.out.println("__________show team Results__________");
        team.showResults();

        System.out.println("__________team members finished course__________");
        team.showMembersFinishedCourse();
    }
}
