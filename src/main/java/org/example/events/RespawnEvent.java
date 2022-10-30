package org.example.events;

import com.bta.events.PlayerRespawnEvent;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.EntityPlayerMP;
import net.minecraft.src.Packet9Respawn;
import org.pf4j.Extension;

import java.util.logging.Logger;

@Extension
public class RespawnEvent implements PlayerRespawnEvent
{

    @Override
    public void onEvent(EntityPlayerMP entityPlayerMP, Packet9Respawn packet9Respawn, MinecraftServer minecraftServer)
    {
        // Logic on respawn goes here
    }

    @Override
    public boolean isCancelled()
    {
        return false; // Cancels event, but still runs your code.
    }
}
