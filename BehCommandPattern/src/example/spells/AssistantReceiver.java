package example.spells;

import example.spells.commands.Age;
import example.spells.commands.Size;
import example.spells.commands.Visibility;

public class AssistantReceiver extends Target {

	public AssistantReceiver() {
		setSize(Size.NORMAL);
		setVisibility(Visibility.VISIBLE);
		setAge(Age.ADULT);
	}

	@Override
	public String toString() {
		return "Assistant";
	}

}