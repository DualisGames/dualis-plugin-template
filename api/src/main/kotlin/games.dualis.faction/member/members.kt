package games.dualis.faction.member

import games.dualis.faction.Faction
import games.dualis.faction.FactionService
import games.dualis.faction.FactionServiceImpl
import org.bukkit.OfflinePlayer
import org.bukkit.entity.Player
import java.util.*

/**
 * Represents the data about a [OfflineFactionMember].
 *
 * Those data are not cached to save memory. There is no reason to store the data
 * about an offline player unless we want to fill the memory of the server.
 *
 * To retrieve those data, the implementation goes through a blocking process. This
 * is the reason why these values are not properties, simply suspending functions.
 */
interface OfflineFactionMember: OfflinePlayer {

    /**
     * Fetches the faction of this [OfflinePlayer].
     */
    suspend fun faction(): Faction?

    /**
     * Defines in the database the faction of this member to [faction].
     */
    suspend fun faction(faction: Faction)

}

/**
 * Represents the data about a [Player].
 *
 * The data provided by the implementation is cached and non-blocking.
 */
interface OnlineFactionMember: OfflineFactionMember, Player {

    /**
     * Returns the [Faction] of this member.
     *
     * This is a non-blocking property since the value is cached.
     */
    val faction: Faction

}

suspend inline fun UUID.factionMember() = FactionService.members.find(this)

suspend inline fun OfflinePlayer.factionMember() = faction.FactionService.members.find(this.uniqueId)

val Player.factionMember: OnlineFactionMember
    get() = faction.FactionService.members.find(this)