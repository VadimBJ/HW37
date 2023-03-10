public class Main {
  public static void main(String[] args) {

    Pawn pawnWhite = new Pawn(Pawn.Color.WHITE,3,5);
    pawnWhite.setCoordinates(4,5);

    Pawn pawnBlack = new Pawn(Pawn.Color.BLACK,7,3);
    pawnBlack.setCoordinates(8,3);

  }
}