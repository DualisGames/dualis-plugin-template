package games.dualis.faction.registry

import games.dualis.faction.Faction
import net.kyori.adventure.text.Component

interface FactionRegistry: Iterable<Faction> {

    /**
     * Finds given [Faction] from its [name].
     */
    suspend fun find(name: Component)

    /**
     * Creates a faction with given [name].
     */
    suspend fun create(name: Component): Faction

    /**
     * Deletes [faction].
     */
    suspend fun delete(faction: Faction)

}