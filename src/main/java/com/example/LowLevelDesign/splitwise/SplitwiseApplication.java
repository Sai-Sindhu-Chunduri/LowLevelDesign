package com.example.LowLevelDesign.splitwise;

import com.example.LowLevelDesign.splitwise.commands.CommandExecutor;
import com.example.LowLevelDesign.splitwise.commands.RegisterCommand;
import com.example.LowLevelDesign.splitwise.commands.SettleUpUserCommand;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SplitwiseApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CommandExecutor commandExecutor = new CommandExecutor();

        commandExecutor.addCommand(new RegisterCommand());
        commandExecutor.addCommand(new SettleUpUserCommand());

        while(true) {
            String input = scanner.next();
            commandExecutor.execute(input);
        }

    }

}
