package games.dualis.faction.member

import games.dualis.faction.Faction
import org.bukkit.OfflinePlayer

interface OfflineFactionMember: OfflinePlayer {

    suspend fun faction(): Faction?

}