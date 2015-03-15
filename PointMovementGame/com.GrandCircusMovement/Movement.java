import java.awt.Point;
import java.util.Scanner;



public class Movement {
	static Point location = new Point(3, 0);
	static Point lastLocation = new Point(3, 0);

	public static Point changeYLocation(int y, Point last) {

		location.y += y;
		lastLocation.y = location.y - y;
		return location;
	}

	public static Point changeXLocation(int x, Point last) {

		location.x += x;
		lastLocation.x = location.x - x;
		return location;
	}

}