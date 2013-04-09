package vooga.rts.input;

import java.awt.geom.Point2D;

public class PositionObject extends ActionObject {
	private double myX;
	private double myY;
	private double myZ;
	
	public PositionObject(double x, double y) {
		this(x, y, 0);
	}
	
	public PositionObject(double x, double y, double z) {
		myX = x;
		myY = y;
		myZ = z;
	}
	
	public double getX() {
		return myX;
	}

	public double getY() {
		return myY;
	}

	public double getZ() {
		return myZ;
	}

	public Point2D getPoint2D() {
		return new Point2D.Double(myX, myY);
	}
}

