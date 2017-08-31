import java.util.List;
import java.util.Map;

public class Flood {

    // Students implement this flood function.

    public static void flood(WaterColor color,
			     List<Coord> flooded_list,
			     Map<Coord,Tile> tiles,
			     Integer board_size) {
    	
    	System.out.println(flooded_list.size());
    
    for(int i = 0; i < flooded_list.size(); i++){
    	
    	tiles.get(flooded_list.get(i)).setColor(color);
    	
    	
    }
    
    	for(int i = 0; i < flooded_list.size(); i++){
    		
    List<Coord> friends = flooded_list.get(i).neighbors(board_size);
    
    for(int j = 0; j <friends.size(); j++) {
    	
    	Tile current = tiles.get(friends.get(j));
    	
    	if( current.getColor().equals(color)){
    		
    		current.setColor(color);
    		
    		flooded_list.add(friends.get(j));
    	}
    }
    	}
    	
    }

}
