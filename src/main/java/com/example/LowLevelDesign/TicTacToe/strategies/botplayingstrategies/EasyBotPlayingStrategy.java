package com.example.LowLevelDesign.TicTacToe.strategies.botplayingstrategies;

import com.example.LowLevelDesign.TicTacToe.models.Board;
import com.example.LowLevelDesign.TicTacToe.models.Cell;
import com.example.LowLevelDesign.TicTacToe.models.CellState;
import com.example.LowLevelDesign.TicTacToe.models.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Move makeMove(Board board) {
        for(List<Cell> row: board.getBoard()) {
            for (Cell cell: row) {
                if(cell.getCellState().equals(CellState.EMPTY)) {
                    return new Move(null, cell);
                }
            }
        }

        return null;
    }
}
