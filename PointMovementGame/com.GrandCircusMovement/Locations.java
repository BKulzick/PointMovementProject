import java.awt.Point;

public class Locations extends Movement{

	static String local ="";
	
	static Point temp;
	
	static Point lobby=new Point(3,0);
	static Point lobby2=new Point (2,0);
	static Point foyer=new Point(1,0);
	static Point kitchen=new Point(1,1);
	static Point microwave=new Point(1,2);
	static Point glasshall=new Point(2,2);
	static Point entrance=new Point(3,2);
	static Point bathrooms=new Point(3,1);
	static Point noGo=new Point(2,1);
	
	public static boolean wallCheck(char direction, Point check){
		
		if (check.x==3 && direction=='e'){
			System.out.println("You hit a wall!!!");
		return false;}
		
		if (check.equals(kitchen) && direction=='e'){
			System.out.println("You hit a wall!");
			return false;
		}
		if (check.equals(lobby2) && direction=='n'){
			System.out.println("You hit a wall!");
			return false;
		}
		if (check.equals(glasshall) && direction=='s'){
			System.out.println("You hit a wall!");
			return false;
		}
		if (check.equals(noGo) && direction=='w'){
			System.out.println("You hit a wall!");
			return false;
		}
		
		return true;
		
		
		
	}
	
	
	public static void locationCheck(Point location) {
		
		
		
		if(location.x < 0 || location.y<0){
			System.out.println("Ouch! You ran into a wall. Try another direction!");
			if(location.x<0)
				location.x=0;
			if(location.y<0)
				location.y=0;
		}
		
		if(location.equals(noGo)){
			System.out.println("You enter the bathrooms. You see a sink and a toilet. It smells fine.\n You can exit back east.");
			
		}
		
		if (location.equals(lobby)){
			local= "You are in the lobby. You see an elevator to the south."
					+ "A door and some bathrooms to the north.\n And an open door to the west.";
			System.out.println(local);
		}
		if (location.equals(lobby2)){
			local= "You are in the entryway. You see a drinking fountain."
					+ "The lobby is to the west.\n And an open door to the west.";
			System.out.println(local);
		}
		
		if (location.equals(foyer)){
			local= "You are in the foyer. You see a couch and some chairs.\n There is a kitchen to the north. "
					+ "There is a glass wall to the west and \nwindows overlooking the city to the south.";
			System.out.println(local);
		}
	
		if(location.equals(kitchen)){
			local= "You are in the kitchen.\n You see Celina jamming to 90s music "
					+ "on her computer.\n There is coffee, tea, and a sink.";
			System.out.println(local);	
		}	
		if(location.equals(microwave)){
			local= "You are in the break area.\n There is a closed microwave. You see your class through\n a glass window wall"
					+ "to the north. There are more doors if you go east.";
			System.out.println(local);	
		}
		if(location.equals(entrance)){
			local= "You are at the entrance to the class room.\n To the north you see your class, to the south is\n a door"
					+ " going who knows where.";
			System.out.println(local);	
		}
		if(location.equals(bathrooms)){
			local= "You see two bathroom doors to the west.\n You see the lobby to the south and a door that heads north.";
			System.out.println(local);	
		}
		if(location.equals(glasshall)){
			local= "The class room entrance is to the east and the break area is to the west. Not much here.";
			System.out.println(local);	
		}
		
			return;
	}

}

