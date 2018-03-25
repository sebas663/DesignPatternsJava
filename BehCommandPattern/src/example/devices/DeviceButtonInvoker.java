package example.devices;

import example.devices.commands.Command;


public class DeviceButtonInvoker {

    private Command command;

    public DeviceButtonInvoker(Command command){
        this.command = command;
    }

    public void press(){
        command.execute();
    }

    public void pressUndo(){
        command.undo();
    }
}
