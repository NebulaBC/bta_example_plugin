package org.example.commands;

import net.minecraft.src.command.Command;
import net.minecraft.src.command.CommandHandler;
import net.minecraft.src.command.CommandSender;
import org.pf4j.Extension;

@Extension
public class OrangeCommand implements com.bta.util.CommandHandler
{
    @Override
    public Command command()
    {
        return new Command("orange")
        {
            @Override
            public boolean execute(CommandHandler commandHandler, CommandSender commandSender, String[] strings)
            {
                commandSender.sendMessage("Ran orange command");
                return true;
            }

            @Override
            public boolean opRequired(String[] strings)
            {
                return false;
            }

            @Override
            public void sendCommandSyntax(CommandHandler commandHandler, CommandSender commandSender)
            {
                commandSender.sendMessage("/orange");
            }
        };
    }
}