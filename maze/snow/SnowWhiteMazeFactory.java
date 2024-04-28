package maze.snow;

import maze.*;

// don't forget to inherit
public class SnowWhiteMazeFactory extends MazeFactory {
    // create the Wall
    public Wall makeWall() {
        return new SnowWhiteWall();
    }

    // create the Room
    public Room makeRoom(int roomNumber) {
        return new SnowWhiteRoom(roomNumber);
    }

    // create the Door
    public Door makeDoor(Room room1, Room room2) {
        return new SnowWhiteDoor(room1, room2);
    }
}
