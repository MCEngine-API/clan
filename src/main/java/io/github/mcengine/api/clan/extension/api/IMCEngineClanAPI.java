package io.github.mcengine.api.clan.extension.api;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Clan-based API module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to provide clan-related APIs to the system.
 */
public interface IMCEngineClanAPI {

    /**
     * Called when the Clan API is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Clan API is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Clan API instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
