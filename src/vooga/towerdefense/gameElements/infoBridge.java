package vooga.towerdefense.gameElements;

import java.util.List;
/**
 * for communication between Actions and GameMap
 * @author gouzhen-1
 *
 */

public interface infoBridge {
	public List<Unit> getUnits();
	public List<Tower> getTowers();
	public void addUnit(Unit unit);
	public void addTower(Tower tower);
	
}
