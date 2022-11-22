package com.example.waylists.domain

data class WayListItem(
    val season: String,
    val date: String,
    val fuelCoeff: Float,
    val milageToday: Float,
    val mileageBefore: Float,
    val milageAfter: Float,
    val fuelIncome: Float,
    val fuelBefore: Float,
    val fuelAfter: Float,
    val fuelSpent: Float,
    var id: Int = UNDEFINED_ID
) {
    companion object {
        const val UNDEFINED_ID = -1
    }
}
