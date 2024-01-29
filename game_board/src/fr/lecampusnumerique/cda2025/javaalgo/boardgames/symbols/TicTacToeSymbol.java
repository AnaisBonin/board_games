package fr.lecampusnumerique.cda2025.javaalgo.boardgames.symbols;

public enum TicTacToeSymbol implements Symbols {
    DEFAULT(" "),
    X("X"),
    O("O");

    private String representation;


    @Override
    public String getRepresentation() {
        return representation;
    }

    TicTacToeSymbol(String representation) { this.representation = representation;}
}