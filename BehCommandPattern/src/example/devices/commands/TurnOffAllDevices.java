package example.devices.commands;

import java.util.List;

import example.devices.devices.ElectronicDevice;


public class TurnOffAllDevices implements Command {

    List<ElectronicDevice> allDevices;

    public TurnOffAllDevices(List<ElectronicDevice> newDevices) {
        allDevices = newDevices;
    }

    public void execute() {
        for (ElectronicDevice device : allDevices) {
            device.off();
        }
    }

    public void undo() {
        for (ElectronicDevice device : allDevices) {
            device.on();
        }
    }
}