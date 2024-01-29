package fr.lecampusnumerique.cda2025.javaalgo.boardgames.players;

import fr.lecampusnumerique.cda2025.javaalgo.boardgames.symbols.TicTacToeSymbol;

public class TicTacToePlayer extends AbstractPlayer {
    public TicTacToePlayer(int number, TicTacToeSymbol symbol, boolean isArtificial) {
        super(number, symbol, isArtificial);
    }

    public void setTicTacToeSymbol(TicTacToeSymbol symbol) {
        super.setSymbol(symbol);
    }

}