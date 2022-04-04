package me.zekepari.asyncrtp;

import me.zekepari.asyncrtp.Commands.Wild;
import org.bukkit.plugin.java.JavaPlugin;

public final class AsyncRTP extends JavaPlugin {

    private final AsyncRTP asyncRTP = this;

    @Override
    public void onEnable() {
        // Plugin startup logic
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        if (getConfig().getBoolean("WildCommand.Enabled")) {
            getCommand("wild").setExecutor(new Wild());
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public AsyncRTP getAsyncRTP() {
        return asyncRTP;
    }
}
