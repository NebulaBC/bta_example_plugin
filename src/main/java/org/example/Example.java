package org.example;

import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

public class Example extends Plugin
{
    public Example(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Override
    public void start()
    {
        // Plugin startup logic.
    }

    @Override
    public void stop()
    {
        // Plugin shutdown logic.
    }
}
