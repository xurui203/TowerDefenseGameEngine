package vooga.towerdefense.gameElements;

import java.util.List;

/**
 * An AbstractAction is superclassed to define specific Actions that can be taken by game elements. 
 * E.g. Use assets (such as fire weapons), boost or kill surround game units 
 * 
 * @author XuRui
 *
 */

public abstract class AbstractAction {
	infoBridge myInfoBridge;
	
	public AbstractAction(infoBridge bridge){
		myInfoBridge=bridge;
		
	}


	/**
	 * Executes action as specific by developer.
	 */
	
	public abstract void execute();
	



}
