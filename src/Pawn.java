public class Pawn {
  public enum Color {
    WHITE,
    BLACK,
  }

  private Color color;
  private int row;
  private int column;

  public Pawn(Color color, int row, int column) {
    this.color = color;

    checkCoordinates(row, column);
    this.row = row;
    this.column = column;
  }

  public int getRow() {
    return row;
  }

  public int getColumn() {
    return column;
  }

  public void setCoordinates(int row, int column) {
    checkCoordinates(row, column);
    if (this.row == row && this.column == column) {
      System.out.println("This move is not available!");
      return;
    }
    if (this.column != column) {
      System.out.println("This move is not available!");
      return;
    }

    if (this.color.equals(color.WHITE)) {
      if (this.row == 2 && (row - this.row) > 0 && (row - this.row) < 3){
        this.row=row;
      } else if (row-this.row==1) {
        this.row=row;
      }else {
        System.out.println("This move is not available!");
        return;
      }
    }
    if (this.color.equals(Color.BLACK)) {
      if (this.row == 7 && (row - this.row) < 0 && (row - this.row) > -3){
        this.row=row;
      } else if (row-this.row==-1) {
        this.row=row;
      }else {
        System.out.println("This move is not available!");
        return;
      }
    }

  }

  private static void checkCoordinates(int row, int column) {
    if (row < 1 || row > 8) {
      throw new IllegalArgumentException("Некорректный номер строки: " + row);
    }

    if (column < 1 || column > 8) {
      System.out.println("Некорректный номер столбца: " + column);
      throw new IllegalArgumentException();
    }
  }
}