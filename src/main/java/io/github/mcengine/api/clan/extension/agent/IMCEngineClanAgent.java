package io.github.mcengine.api.clan.extension.agent;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Clan-based Agent module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to integrate clan-related agents into the system.
 */
public interface IMCEngineClanAgent {

    /**
     * Called when the Clan Agent is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Clan Agent is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Clan Agent instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
