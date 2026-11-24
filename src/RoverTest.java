import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class RoverTest {

    @Test
    public void positionGardeSesCoordonnees() {
        Position p = new Position(3, 5);
        assertEquals(3, p.getX());
        assertEquals(5, p.getY());
    }

    @Test
    public void setXChangeLaPosition() {
        Position p = new Position(0, 0);
        p.setX(7);
        assertEquals(7, p.getX());
    }

    @Test
    public void grilleSansObstacle() {
        Grid grid = new Grid(new ArrayList<>());
        assertFalse(grid.hasObstaclesAt(new Position(1, 1)));
    }

    @Test
    public void grilleDetecteObstacle() {
        List<Position> obstacles = new ArrayList<>();
        obstacles.add(new Position(2, 2));
        Grid grid = new Grid(obstacles);
        assertTrue(grid.hasObstaclesAt(new Position(2, 2)));
    }

    @Test
    public void roverGardeSonPointDeDepart() {
        Position depart = new Position(0, 0);
        Rover rover = new Rover(new Position(0, 0), depart, new Grid(new ArrayList<>()));
        assertEquals(depart, rover.getStartingPoint());
    }

    @Test
    public void roverPasseDeLautreCoteDeLaGrille() {
        Grid grid = new Grid(new ArrayList<>());
        new Rover(new Position(101, 50), new Position(0, 0), grid);
        grid.fromOneEdgeToTheOther();
        assertEquals(0, Rover.position.getX());
    }
}