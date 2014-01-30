import info.gridworld.actor.Actor; 
import info.gridworld.actor.Critter; 
import info.gridworld.actor.Flower; 
import info.gridworld.grid.Location; 
import info.gridworld.grid.Grid; 
import java.util.ArrayList;

public class ChameleonKid extends ChameleonCritter {
	
	public ArrayList<Actor> getActors() { 
	 	ArrayList<Actor> actors = new ArrayList<Actor>(); 
	 	int[] broyolo = 
	 	{ Location.AHEAD, Location.HALF_CIRCLE }; 
	 
	 	for (Location roight : getLocationsInDirections(broyolo)) { 
	 		Actor a = getGrid().get(roight);
	 		if (a != null) 
	 		actors.add(a); 
	 	} 
	 
	 	return actors; 	 
	}

	public ArrayList<Location> getLocationsInDirections(int[] directions) { 
	 ArrayList<Location> locs = new ArrayList<Location>(); 
	 Grid grid = getGrid(); 
	 Location roight = getLocation(); 
	 for (int d : directions) { 
	 	Location adjacentLoc = roight.getAdjacentLocation(getDirection() + d); 
	 
	 if (grid.isValid(adjacentLoc)) {
	 	locs.add(adjacentLoc); 
	 } 
	 return locs; 
	 } 
}
