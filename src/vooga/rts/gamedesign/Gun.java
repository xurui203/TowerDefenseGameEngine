package vooga.rts.gamedesign;

import vooga.rts.gamedesign.sprite.rtsprite.Projectile;
import vooga.rts.util.Location;

public class Gun extends Weapon{
// YOLO

	public Gun(int damage, Projectile projectile, int range, Location center, int cooldown) {
		super(damage, projectile, range, center, cooldown);
	}

}
