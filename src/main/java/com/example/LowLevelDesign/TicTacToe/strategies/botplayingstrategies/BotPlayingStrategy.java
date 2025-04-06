package com.example.LowLevelDesign.TicTacToe.strategies.botplayingstrategies;

import com.example.LowLevelDesign.TicTacToe.models.Board;
import com.example.LowLevelDesign.TicTacToe.models.Move;

public interface BotPlayingStrategy {

    Move makeMove(Board board);
}
