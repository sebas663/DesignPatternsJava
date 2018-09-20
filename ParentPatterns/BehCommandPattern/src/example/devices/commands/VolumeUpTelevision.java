package example.devices.commands;

import example.devices.devices.ElectronicDevice;

public class VolumeUpTelevision implements Command {

	private ElectronicDevice device;

	public VolumeUpTelevision(ElectronicDevice device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.volumeUp();
	}

	@Override
	public void undo() {
		device.volumenDown();
	}

}
