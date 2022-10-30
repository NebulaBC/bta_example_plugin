package org.example.events;

import com.bta.events.PlayerChatEvent;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.EntityPlayerMP;
import net.minecraft.src.Packet3Chat;
import net.minecraft.src.command.ChatColor;
import org.pf4j.Extension;

import java.util.logging.Logger;

@Extension
public class ChatEvent implements PlayerChatEvent
{
    @Override
    public void onEvent(EntityPlayerMP entityPlayerMP, Packet3Chat packet3Chat, MinecraftServer minecraftServer)
    {
        Logger logger = Logger.getLogger("Minecraft");
        String s = packet3Chat.message;
        String a;
        a = ChatColor.lime + "[Member] " + ChatColor.white + entityPlayerMP.getDisplayName() + ChatColor.white + ": " + s;
        logger.info(a);
        minecraftServer.configManager.sendPacketToAllPlayers(new Packet3Chat(a));
    }

    @Override
    public boolean isCancelled()
    {
        return true;
    }
}
