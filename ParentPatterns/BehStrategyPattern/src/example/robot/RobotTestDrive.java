package example.robot;

public class RobotTestDrive {

    public static void main(String[] args) {

        Robot roboto = new Robot();
        roboto.setName("Mr. Roboto");
        roboto.setBehavior(new AgressiveBehavior());

        roboto.move();
    }

}
