package io.github.mcengine.api.clan.extension.library;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Clan-based Library module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to provide clan-related library support to the system.
 */
public interface IMCEngineClanLibrary {

    /**
     * Called when the Clan Library is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Clan Library is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Clan Library instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
