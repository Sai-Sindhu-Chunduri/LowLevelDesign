package com.example.LowLevelDesign.TicTacToe.strategies.winningstrategies;

import com.example.LowLevelDesign.TicTacToe.models.Board;
import com.example.LowLevelDesign.TicTacToe.models.Move;

public interface WinningStrategy {

    boolean checkWinner(Board board, Move move);

    void handleUndo(Board board, Move move);
}
