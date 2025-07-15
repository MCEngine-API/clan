package io.github.mcengine.api.clan.extension.dlc;

import org.bukkit.plugin.Plugin;

/**
 * Represents a DLC module that can be dynamically loaded into the MCEngine clan system.
 * <p>
 * DLC modules typically contain new gameplay content, mechanics, or major feature expansions.
 * Implement this interface to allow your DLC module to be discovered and initialized by the MCEngine.
 */
public interface IMCEngineClanDLC {

    /**
     * Called when the DLC module is loaded by the MCEngine.
     * <p>
     * Use this method to perform any setup or registration logic required
     * for the DLC to function as intended.
     *
     * @param plugin The {@link Plugin} instance providing context for this DLC module.
     */
    void onLoad(Plugin plugin);
}
