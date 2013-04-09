
package vooga.scroller.model;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import vooga.scroller.level_editor.Level;
import vooga.scroller.scrollingmanager.ScrollingManager;
import vooga.scroller.test_sprites.Coin;
import vooga.scroller.test_sprites.Koopa;
import vooga.scroller.test_sprites.Platform;
import vooga.scroller.test_sprites.Turtle;
import vooga.scroller.util.Location;
import vooga.scroller.util.Pixmap;
import vooga.scroller.util.PlatformerConstants;
import vooga.scroller.view.View;
/**
 * Instantiates all of the levels for gameplay.
 * 
 * @author Scott Valentine
 *
 */
public class LevelFactory {

    /**
     * Generates levels to be displayed by the view and played by the model.
     * 
     * @param view is the view used for level information.
     * @return a List of all levels that will be played in the game.
     */
    public List<Level> generateLevels (ScrollingManager myScrollingManager, View view) {
        Level myCurrLevel = new Level(1, myScrollingManager, view);
        
        // TODO: this will ideally read in levels from file and create instances of each level
        // This works for demos
        
        myCurrLevel.addSprite(new Coin(new Pixmap("coin.gif"), 
                                new Location(view.getWidth() - 400, view.getHeight() - 250),
                                new Dimension(30, 30)));   

        myCurrLevel.addSprite(new Koopa(new Pixmap("koopa.gif"), 
                                 new Location(view.getWidth() - 300, view.getHeight() - 275),
                                 new Dimension(30, 60)));   

        myCurrLevel.addSprite(new Platform(new Pixmap("platform.gif"), 
                                    new Location(view.getWidth() - 80, view.getHeight() - 150),
                                    new Dimension(30, 60)));   

        myCurrLevel.addSprite(new Turtle(new Pixmap("turtle.gif"), 
                                  new Location(view.getWidth() - 500, view.getHeight() - 75),
                                  new Dimension(30, 60)));   
        
        
        
        myCurrLevel.setSize(PlatformerConstants.DEFAULT_LEVEL_SIZE);
        List<Level> l = new ArrayList<Level>();
        l.add(myCurrLevel);
        return l;
    }

}
