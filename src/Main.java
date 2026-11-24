import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Obstacles placés sur la grille
        Grid grid = new Grid(List.of(
                new Position(3, 4),
                new Position(10, 10)
        ));

        // Position de départ du rover
        Position start = new Position(0, 0);
        Rover rover = new Rover(new Position(start.getX(), start.getY()), start, grid);

        System.out.println("=== Mars Rover ===");
        System.out.println("Point de départ : (" + rover.getStartingPoint().getX()
                + ", " + rover.getStartingPoint().getY() + ")");
        System.out.println("Position actuelle : (" + Rover.position.getX()
                + ", " + Rover.position.getY() + ")");
    }

}
