public class Rover {

    protected static Position position;
    private Position startingPoint;
    private DIRECTION direction;
    private final Grid grid;


    public Rover(Position position, Position startingPoint, Grid grid) {
        this.position = position;
        this.startingPoint = startingPoint;
        this.grid = grid;
    }

    public void moveForward() {
        switch (direction) {
            case N:
                position.setY(position.getY() + 1);
            case W:
                position.setX(position.getX() - 1);
            case S:
                position.setY(position.getY() - 1);
            case E:
                position.setX(position.getX() + 1);
        }
    }

    public void moveBackward() {
        switch (direction) {
            case N:
                position.setY(position.getY() - 1);
            case W:
                position.setX(position.getX() + 1);
            case S:
                position.setY(position.getY() + 1);
            case E:
                position.setX(position.getX() - 1);
        }
    }

    public void turnLeft(){
        switch(direction) {
            case N:
                direction = DIRECTION.W;
            case W:
                direction = DIRECTION.S;
            case S:
                direction = DIRECTION.E;
            case E:
                direction = DIRECTION.N;
        }
    }

    public void turnRight(){
        switch(direction) {
            case N:
                direction = DIRECTION.E;
            case W:
                direction = DIRECTION.N;
            case S:
                direction = DIRECTION.W;
            case E:
                direction = DIRECTION.S;
        }
    }

    public boolean obstacleDetection() {
        switch (direction) {
            case N:
                if (grid.hasObstaclesAt(new Position(position.getX(), position.getY() + 1))) {
                    System.out.println("Obstacle détécté");
                    return true;
                }
            case W:
                if (grid.hasObstaclesAt(new Position(position.getX() - 1, position.getY()))) {
                    System.out.println("Obstacle détécté");
                    return true;
                }
            case S:
                if (grid.hasObstaclesAt(new Position(position.getX(), position.getY() - 1))) {
                    System.out.println("Obstacle détécté");
                    return true;
                }
            case E:
                if (grid.hasObstaclesAt(new Position(position.getX() + 1, position.getY()))) {
                    System.out.println("Obstacle détécté");
                    return true;
                }
            default :
                return false;
        }
    }

    public Position getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(Position startingPoint) {
        this.startingPoint = startingPoint;
    }
}