package games.dualis.faction.member

import org.bukkit.entity.Player
import java.util.UUID

/**
 * An object used to retrieve the members of a faction.
 */
interface FactionMembers {

    /**
     * Returns the members that are connected to the server.
     */
    fun online(): List<OnlineFactionMember>

    /**
     * Retrieves the members that are disconnected.
     */
    suspend fun offline() = everyone().minus(online().toSet())

    /**
     * Returns every member in the faction.
     */
    suspend fun everyone(): List<OfflineFactionMember>

    /**
     * Finds the data of the player with given [uniqueId] in
     * this fation.
     */
    suspend fun find(uniqueId: UUID): OfflineFactionMember?

    /**
     * Finds the data of the [player] in this faction.
     */
    fun find(player: Player): OnlineFactionMember

}