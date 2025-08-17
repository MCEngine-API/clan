package io.github.mcengine.api.clan.extension.dlc;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Clan-based DLC module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to integrate downloadable content into the system.
 */
public interface IMCEngineClanDLC {

    /**
     * Called when the Clan DLC is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Clan DLC is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Clan DLC instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
