public int getPointsForRow(int targetRow){
  int total=0;
  boolean dou=true;
  for(int c=0;c<board[targetRow].length;c++){
    total+=board[targetRow][c].getPoints();
    if(board[targetRow][c].getColor()!=board[targetRow][0].getColor()){
      dou=false;
    }
  }
  if(dou){
    return total*2;
  }
  return total;
}
 
