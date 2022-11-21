package com.example.waylists.domain

class AddWayListUseCase(private val wayListRepository: WayListRepository) {
    fun addWayList(wayListItem: WayListItem) {
        wayListRepository.addWayList(wayListItem)
    }
}