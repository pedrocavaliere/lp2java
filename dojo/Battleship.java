class Battleship {
  int startLocationX;
  int endLocationX;

  int startLocationY;
  int endLocationY;

  int startLocationZ;
  int endLocationZ;

  public void setLocation(int startX, int endX, int startY, int endY, int startZ, int endZ){
    startLocationX = startX;
    endLocationX = endX;

    startLocationY = startY;
    endLocationY = endY;

    startLocationZ = startZ;
    endLocationZ = endZ;
  }

  public boolean checkHit(int x, int y, int z){

    return (x >= startLocationX &&
            x <= endLocationX &&
            y >= startLocationY &&
            y <= endLocationY &&
            z >= startLocationZ &&
            z <= endLocationZ);
  }
}
