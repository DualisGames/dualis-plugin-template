package games.dualis.faction

import games.dualis.faction.member.FactionMembers
import net.kyori.adventure.text.Component
import org.bukkit.Location

/**
 * A [Faction] is a coalition of players playing together and defending their
 * heart (if it exists).
 */
interface Faction {

    /**
     * Returns the name of this [Faction].
     *
     * We actually give players the freedom of stylizing their faction names.
     */
    var name: Component

    /**
     * Returns the description of this [Faction].
     */
    var description: String

    /**
     * Returns the heart's location of this faction.
     */
    var heart: Location?

    /**
     * Returns the power of this faction.
     */
    var power: Int

    /**
     * Returns the members wrapped in a [FactionMembers].
     */
    val members: FactionMembers

}

suspend inline fun Faction.delete() = FactionService.registry.delete(this)