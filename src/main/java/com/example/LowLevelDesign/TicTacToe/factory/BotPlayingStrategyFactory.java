package com.example.LowLevelDesign.TicTacToe.factory;

import com.example.LowLevelDesign.TicTacToe.models.BotDifficultyLevel;
import com.example.LowLevelDesign.TicTacToe.strategies.botplayingstrategies.BotPlayingStrategy;
import com.example.LowLevelDesign.TicTacToe.strategies.botplayingstrategies.EasyBotPlayingStrategy;
import com.example.LowLevelDesign.TicTacToe.strategies.botplayingstrategies.HardBotPlayingStrategy;
import com.example.LowLevelDesign.TicTacToe.strategies.botplayingstrategies.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel) {
        // basis the user input, create an object of the underlying class
        if(botDifficultyLevel.equals(BotDifficultyLevel.EASY)) {
            return new EasyBotPlayingStrategy();
        } else if(botDifficultyLevel.equals(BotDifficultyLevel.HARD)) {
            return new HardBotPlayingStrategy();
        } else if(botDifficultyLevel.equals(BotDifficultyLevel.MEDIUM)) {
            return new MediumBotPlayingStrategy();
        }
        return null;
    }
}
