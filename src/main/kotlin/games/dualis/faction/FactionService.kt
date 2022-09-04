package games.dualis.faction

import games.dualis.faction.member.FactionMembers
import games.dualis.faction.registry.FactionRegistry
import org.koin.java.KoinJavaComponent.inject

interface FactionService {

    /**
     * Returns the global [FactionRegistry].
     */
    val registry: FactionRegistry

    /**
     * Returns the global implementation of [FactionMembers].
     */
    val members: FactionMembers

    companion object {
        /**
         * Returns the global [FactionRegistry].
         */
        val registry: FactionRegistry
            get() = FactionServiceImpl.registry

        /**
         * Returns the global implementation of [FactionMembers].
         */
        val members: FactionMembers
            get() = FactionServiceImpl.members
    }

}

internal object FactionServiceImpl: FactionService by
    inject<FactionService>(FactionService::class.java).value