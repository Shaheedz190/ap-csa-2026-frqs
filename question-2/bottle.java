public class Bottle{
  private double water;
  private double left;
  public Bottle(double w){
    water=w;
    left=w;
  }
  public void updateAmound(double c){
    left-=c;
    if (left<water/4){
      left=water;
    }
    return left;
  }
}
