import java.util.Random;

public class Die
{
   private int sides;
   private int value;
   
   public Die(int sides)
   {
      this.sides = sides;
      roll();
   }
   public void roll()
   {
      Random rand = new Random();
      value = rand.nextInt(sides);
   }
   public int getSides()
   {
      return sides;
   }
   public int getValue()
   {
      return value;
   }
}