package games.dualis.faction.member

import org.bukkit.entity.Player
import java.util.UUID

interface FactionMembers {

    fun online(): List<OnlineFactionMember>

    suspend fun offline() = everyone().minus(online().toSet())

    suspend fun everyone(): List<OfflineFactionMember>

    suspend fun find(uniqueId: UUID): OfflineFactionMember?

    fun find(player: Player): OnlineFactionMember

}