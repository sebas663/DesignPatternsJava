package example.army;

public final class CommanderImplTest {
	public void testMediator() throws Exception {
		Commander commander = new CommanderImpl();
		ArmedUnit soldierUnit = new SoldierUnit(commander);
		ArmedUnit tankUnit = new TankUnit(commander);
		commander.registerArmedUnits(soldierUnit, tankUnit);
		commander.startAttack(soldierUnit);
		commander.startAttack(tankUnit);
		commander.ceaseAttack(soldierUnit);
		commander.startAttack(tankUnit);
	}
}
