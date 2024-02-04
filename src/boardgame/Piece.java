package boardgame;

public abstract class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
    }
    protected Board getBoard() {
        return board;
    }
    public abstract boolean[][] possibleMoves();
    public boolean possibleMove(Position position){ //classe concreta que implementa uma abstrata - conceito de Hook
        return possibleMoves()[position.getRow()][position.getColumn()];
    }
    public boolean isThereAnyPossibleMove(){
        boolean [][] mat = possibleMoves();
        for (int i=0; i<mat.length; i++){
            for (int k=0; k< mat.length; k++){
                if (mat[i][k]){
                    return true;
                }
            }
        }
        return false;
    }
}
