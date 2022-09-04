package games.dualis.faction.member

import games.dualis.faction.FactionServiceImpl
import org.bukkit.OfflinePlayer
import org.bukkit.entity.Player
import java.util.*

suspend fun UUID.factionMember() = FactionServiceImpl.members.find(this)

suspend fun OfflinePlayer.factionMember() = FactionServiceImpl.members.find(this.uniqueId)

fun Player.factionMember() = FactionServiceImpl.members.find(this)
