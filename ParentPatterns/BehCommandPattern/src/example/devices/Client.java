package example.devices;

import java.util.ArrayList;
import java.util.List;

import example.devices.commands.TurnOffAllDevices;
import example.devices.commands.TurnOffTelevision;
import example.devices.commands.TurnOnTelevision;
import example.devices.commands.VolumeUpTelevision;
import example.devices.devices.ElectronicDevice;
import example.devices.devices.Radio;
import example.devices.devices.Television;


public class Client {

    public static void main(String[] args){

        ElectronicDevice televisionOne = new Television("SAMSUMG");

        TurnOnTelevision onCommand = new TurnOnTelevision(televisionOne);

        DeviceButtonInvoker onPressed;
        onPressed = new DeviceButtonInvoker(onCommand);
        onPressed.press();


        TurnOffTelevision offCommand = new TurnOffTelevision(televisionOne);
        onPressed = new DeviceButtonInvoker(offCommand);
        onPressed.press();

        VolumeUpTelevision volUpCommand = new VolumeUpTelevision(televisionOne);
        onPressed = new DeviceButtonInvoker(volUpCommand);
        onPressed.press();
        onPressed.press();
        onPressed.press();

        Television televisionTwo = new Television("SONY");
        Radio radioOne = new Radio("PIONEER");

        List<ElectronicDevice> allDevices = new ArrayList<>();

        allDevices.add(televisionTwo);
        allDevices.add(radioOne);

        TurnOffAllDevices turnOffDevices = new TurnOffAllDevices(allDevices);

        DeviceButtonInvoker turnThemOff = new DeviceButtonInvoker(turnOffDevices);

        turnThemOff.press();
        turnThemOff.pressUndo();

    }

}
