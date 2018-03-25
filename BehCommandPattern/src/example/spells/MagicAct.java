package example.spells;

import example.spells.commands.AgeSpell;
import example.spells.commands.InvisibilitySpell;
import example.spells.commands.ShrinkSpell;

public class MagicAct {

	public static void main(String[] args) {
		WizardInvoker wizard = new WizardInvoker();
		AssistantReceiver assistant = new AssistantReceiver();

		assistant.printStatus();

		wizard.castSpell(new ShrinkSpell(), assistant);
		assistant.printStatus();

		wizard.castSpell(new InvisibilitySpell(), assistant);
		assistant.printStatus();

		wizard.undoLastSpell();
		assistant.printStatus();

		wizard.undoLastSpell();
		assistant.printStatus();

		wizard.redoLastSpell();
		assistant.printStatus();

		wizard.redoLastSpell();
		assistant.printStatus();

		/// Add a new spell
		wizard.castSpell(new AgeSpell(), assistant);
		assistant.printStatus();
	}

}
