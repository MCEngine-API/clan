package io.github.mcengine.api.clan.extension.api;

import org.bukkit.plugin.Plugin;

/**
 * Represents a clan-related DLC module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to create a plugin extension that hooks into the clan system
 * provided by the MCEngine. The implementation should register its functionality within the {@link #onLoad(Plugin)} method.
 */
public interface IMCEngineClanAPI {

    /**
     * Called when the DLC module is loaded by the engine.
     * <p>
     * This method should be used to initialize any resources, register listeners,
     * or perform setup logic necessary for the plugin extension to function correctly.
     *
     * @param plugin The {@link Plugin} instance that is providing the context for this DLC module.
     */
    void onLoad(Plugin plugin);
}
