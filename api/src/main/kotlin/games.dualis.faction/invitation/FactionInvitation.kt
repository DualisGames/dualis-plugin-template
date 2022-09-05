package games.dualis.faction.invitation

import games.dualis.faction.Faction
import games.dualis.faction.member.OfflineFactionMember

interface FactionInvitation {

    /**
     * Returns the faction concerned by this invitation.
     */
    val faction: Faction

    /**
     * Returns the player who received the invitation to join [faction].
     */
    val receiver: OfflineFactionMember

    /**
     * Returns the sender of the invitation to [receiver].
     */
    val emitter: OfflineFactionMember

}