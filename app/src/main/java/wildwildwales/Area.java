/**
 * This class describes a 'node' of the map.
 * @author jackroberts
 *
 */

package wildwildwales;


public class Area {
	
	private int areaLevel = 0;
	private Actor monster = null; //Actor if monster is present in area. Null otherwise.
	private String description = null;
	
	/**
	 * Creates a new area with the given attributes.
	 * @param description String description of any area.
	 * @param areaLevel Difficulty level of an area, 0 to 100.
	 * @param monster Actor of any monster if present in area. Null if no monster is present.
	 */
	public Area(String description, int areaLevel, Actor monster) {
		this.areaLevel = areaLevel;
		this.monster = monster;
		this.description = description;
	}
	
	/**
	 * Provides the difficulty level of the area.
	 * @return Difficulty level of area.
	 */
	public int getAreaLevel() {
		return areaLevel;
	}
	
	/**
	 * Allows update of Area difficulty.
	 * @param areaLevel New difficulty level of area.
	 */
	public void setAreaLevel(int areaLevel) {
		this.areaLevel = areaLevel;
	}
	
	/**
	 * Provides Actor of monster in area.
	 * @return Actor of monster in area, null if no monster is present.
	 */
	public Actor getMonster() {
		return monster;
	}
	
	
	/**
	 * Allows update of monster in area.
	 * @param monster Actor of new monster, null if no monster desired.
	 */
	public void setMonster(Actor monster) {
		this.monster = monster;
	}


	/**
	 * Provides description of area.
	 * @return Lengthy description of area.
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * Allows update of area's description.
	 * @param description Lengthy String description of Area.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
