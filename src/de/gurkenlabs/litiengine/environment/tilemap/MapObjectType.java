package de.gurkenlabs.litiengine.environment.tilemap;

public enum MapObjectType {
  PROP, EMITTER, SPAWNPOINT, LANE, DECORMOB, COLLISIONBOX, LIGHTSOURCE, TRIGGER, UNKNOWN;

  public static MapObjectType get(String mapObjectType) {
    if (mapObjectType == null || mapObjectType.isEmpty()) {
      return MapObjectType.UNKNOWN;
    }

    try {
      return MapObjectType.valueOf(mapObjectType);
    } catch (IllegalArgumentException iae) {
      return MapObjectType.UNKNOWN;
    }
  }
  
  public static MapObjectType fromOrdinal(int n) {return values()[n];}
}
