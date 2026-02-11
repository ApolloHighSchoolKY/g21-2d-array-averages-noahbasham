import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    double average = 0;
    for(int row = 0; row<ray.length; row++)
    {
      for(int col = 0; col<ray[row].length; col++)
      {
        average += ray[row][col];
      }
      average = average / ray[0].length;
      System.out.println("Row " + row + ": " + average);
      average = 0;
    }
  }

  public void columnAverages(){
    //Column major order
    //   Take each column and go through all of the rows
    //   Top down and Left to Right
    double average = 0;
    for(int col = 0; col<ray[0].length; col++)
    {
      for(int row = 0; row<ray.length; row++)
      {
        average += ray[row][col];
      }
      average = average / ray.length;
      System.out.println("Column " + col + ": " + average);
      average = 0;
    }
  }

  public void arrayAverage(){
    double average = 0;
    for(int row = 0; row<ray.length; row++)
    {
      for(int col = 0; col<ray[row].length; col++)
      {
        average += ray[row][col];
      }
    }
    average = average / (ray.length * ray[0].length);
    System.out.println("The array's average is: " + average);
  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    return "";
  }
}
