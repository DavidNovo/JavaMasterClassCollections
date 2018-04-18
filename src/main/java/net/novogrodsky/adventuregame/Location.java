package net.novogrodsky.adventuregame;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dev on 8/12/2015.
 */
public class Location {

  private final int locationId;
  private final String description;
  private final Map<String, Integer> exits;

  /**
   * This represents a location in the game.
   * @param locationId
   * @param description
   * @param exits
   */
  public Location(int locationId, String description, Map<String, Integer> exits) {
    this.locationId= locationId;
    this.description = description;
    this.exits = new HashMap<String, Integer>(exits);
    this.exits.put("Q", 0);
  }

  public int getLocationId() {
    return locationId;
  }

  public String getDescription() {
    return description;
  }

  public Map<String, Integer> getExits() {
    return new HashMap<String, Integer>(exits);
  }
}
