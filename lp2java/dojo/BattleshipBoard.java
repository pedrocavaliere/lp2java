import java.util.*;

class BattleshipBoard {
  int boardMaxX;
  int boardMaxY;
  int boardMaxZ;

  ArrayList<Battleship> ships = new ArrayList<Battleship>();

  public void setBoard(int x, int y, int z){
    boardMaxX = x;
    boardMaxY = y;
    boardMaxZ = z;
  }

  public void addShip(Battleship ship){
    ships.add(ship);
  }

  private boolean isNotInBoard(int locationX, int locationY, int locationZ){
    return (locationX < 0 || locationX > boardMaxX ||
            locationY < 0 || locationY > boardMaxY ||
            locationZ < 0 || locationZ > boardMaxZ);
  }

  public String fire(String inputX, String inputY, String inputZ){
    int locationX;
    int locationY;
    int locationZ;

    try {
      locationX = Integer.parseInt(inputX);
      locationY = Integer.parseInt(inputY);
      locationZ = Integer.parseInt(inputZ);
    } catch (NumberFormatException e) {
      return "ERRO";
    }

    if (isNotInBoard(locationX, locationY, locationZ)){
      return "ERRO(FORA)";
    }

    for (Battleship ship : ships) {
      if (ship.checkHit(locationX, locationY, locationZ)){
        return "hit";
      }
    }
    return "miss";
  }
}
