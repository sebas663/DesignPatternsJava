package example.robot;

public class RobotTestDrive {

    public static void main(String[] args) {

        Robot roboto = new Robot();
        roboto.setName("Mr. Roboto");
        roboto.setBehavior(new AgressiveBehavior());
        roboto.move();
        roboto.setBehavior(new DefensiveBehavior());
        roboto.move();
        roboto.setBehavior(new NormalBehavior());
        roboto.move();
    }

}
