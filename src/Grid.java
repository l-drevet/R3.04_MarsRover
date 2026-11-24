import java.util.List;

public class Grid {
    private final int WIDTH = 100;
    private final int HEIGHT = 100;
    private final List<Position> obstacles;


    public Grid(List<Position> obstacles) {
        this.obstacles = List.copyOf(obstacles);
    }

    public boolean hasObstaclesAt(Position position) {
        return obstacles.contains(position);
    }
    public void fromOneEdgeToTheOther(){
        if(Rover.position.getX() > WIDTH){
            Rover.position.setX(0);
        } else
        if(Rover.position.getX() < 0){
            Rover.position.setX(100);
        } else
        if(Rover.position.getY() > HEIGHT){
            Rover.position.setY(0);
        } else
        if(Rover.position.getY() < 0){
            Rover.position.setY(100);
        }
    }
}