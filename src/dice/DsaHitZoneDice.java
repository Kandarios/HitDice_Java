package dice;

public class DsaHitZoneDice extends D20 {
  public enum ZoneIndicator {
    HEAD, LEFTARM, RIGHTARM, CHEST, STOMACH, BACK, LEFTLEG, RIGHTLEG, OUTOFBOUND;
  }
  ZoneIndicator getZone() {
    switch(roleDice()) {
    case 1:
    case 3:
    case 5:
      return ZoneIndicator.LEFTARM;
    case 2:
    case 4:
    case 6:
      return ZoneIndicator.RIGHTARM;
    case 7:
    case 8:
      return ZoneIndicator.STOMACH;
    case 9:
    case 11:
    case 13:
      return ZoneIndicator.LEFTLEG;
    case 10:
    case 12:
    case 14:
      return ZoneIndicator.RIGHTLEG;
    case 15:
    case 16:
    case 17:
    case 18:
      return ZoneIndicator.CHEST;
    case 19:
    case 20: 
      return ZoneIndicator.HEAD;
    default:
      return ZoneIndicator.OUTOFBOUND;
    }
  }
}
