package com.example.LowLevelDesign.TicTacToe.strategies.winningstrategies;

import com.example.LowLevelDesign.TicTacToe.models.Board;
import com.example.LowLevelDesign.TicTacToe.models.Move;

public class ColWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, Move move) {
        // HOW
        return false;
    }

    @Override
    public void handleUndo(Board board, Move move) {

    }
}
