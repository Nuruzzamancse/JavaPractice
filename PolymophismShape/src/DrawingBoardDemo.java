public class DrawingBoardDemo {

    public static void main(String[] args){
        DrawingBoard drawingBoard = new DrawingBoard();
        Circle circle = new Circle();
        Square square = new Square();

        drawingBoard.draw(circle);

        drawingBoard.draw(square);
    }
}
