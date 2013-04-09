
package vooga.scroller.test_sprites;

import java.awt.Dimension;
import vooga.scroller.collision_handlers.Platform_CH;
import vooga.scroller.sprite_superclasses.StaticEntity;
import vooga.scroller.util.Location;
import vooga.scroller.util.Pixmap;

public class Platform extends StaticEntity{

    private Platform_CH collisionHandler = new Platform_CH();
    
    
    public Platform_CH getCollisionHandler () {
        return collisionHandler;
    }

    public void setCollisionHandler (Platform_CH collisionHandler) {
        this.collisionHandler = collisionHandler;
    }
    
    public Platform (Pixmap image, Location center, Dimension size) {
        super(image, center, size);
        // TODO Auto-generated constructor stub
    }

    public void print() {
        System.out.println("Platform");
    }
    
    @Override
    public Type getType() {
        return Type.PLATFORM;
    }
}
