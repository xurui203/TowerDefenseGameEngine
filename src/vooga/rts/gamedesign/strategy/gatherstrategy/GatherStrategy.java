package vooga.rts.gamedesign.strategy.gatherstrategy;

import vooga.rts.gamedesign.sprite.rtsprite.IGatherable;
import vooga.rts.gamedesign.sprite.rtsprite.Resource;

/**
 * This interface is implemented by the classes CanGather and CannotGather that
 * are then used as instance variables in the classes that could potentially
 * gather resources.  If the unit currently can gather, it will have an 
 * instance of CanGather, otherwise it will have an instance of CannotGather.
 * Using the strategy pattern like this, interactives ability to gather 
 * can be dynamically changed. For example, a unit may be implemented such 
 * that it cannot gather resources until it hits a certain level. The unit 
 * will initially have an instance of CannotGather but once the level is 
 * reached it will switch to have an instance of CanGather.
 * 
 * @author Ryan Fishel
 * @author Kevin Oh
 * @author Francesco Agosti
 * @author Wenshun Liu 
 *
 */
public interface GatherStrategy {
	
	public void gather(IGatherable g); //change to specify which kind of resource.
	
	
}