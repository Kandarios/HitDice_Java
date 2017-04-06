package dice;

import java.security.SecureRandom;

public class D20 implements Dice {
  SecureRandom random = new SecureRandom();
  @Override
  public int roleDice() {
    return random.nextInt(20) + 1;
  }

}
